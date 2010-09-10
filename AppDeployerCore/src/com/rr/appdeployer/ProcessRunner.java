/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rr.appdeployer;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raks
 */
public class ProcessRunner {

    public static String executeProcess(String command, File workingDir, OutputStream output) {

        StringBuffer sbf = new StringBuffer();
        try {

            Process p;
            if (workingDir == null) {
                p = Runtime.getRuntime().exec(command);
            } else {
                p = Runtime.getRuntime().exec(command, null, workingDir);
            }
            Thread t = new Thread(new ProcessOutputReader(p, output, sbf));
            t.start();
            p.waitFor();
            if (p.exitValue() != 0) {
                throw new RuntimeException("Process execution failed. Process returned exit value: " + p.exitValue() + " \n The standard output is\n" + output.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException("IOException while running process", e);
        } catch (InterruptedException e) {
            throw new RuntimeException("InterruptedException while running process", e);
        }
        return sbf.toString();
    }
}

class ProcessOutputReader implements Runnable {

    Process p;
    OutputStream output;
    StringBuffer sbf;

    public ProcessOutputReader(Process p, OutputStream output, StringBuffer sbf) {
        this.p = p;
        this.output = output;
        this.sbf = sbf;
    }

    public void run() {
        try {
            String line;
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null) {
                if (output != null) {
                    output.write(line.getBytes());
                    output.write("\n".getBytes());
                }
                sbf.append(line).append("\n");
            }
            input.close();
        } catch (IOException ex) {
            Logger.getLogger(ProcessOutputReader.class.getName()).log(Level.SEVERE, "Error while reading output of the process!! ", ex);
        }

    }
}
