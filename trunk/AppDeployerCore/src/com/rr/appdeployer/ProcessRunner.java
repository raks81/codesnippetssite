/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rr.appdeployer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raks
 */
public class ProcessRunner {

    public static String executeProcess(String path) {
        StringBuffer output = new StringBuffer();
        try {

            Process p = Runtime.getRuntime().exec(path);
            Thread t = new Thread(new ProcessOutputReader(p, output));
            t.start();
            p.waitFor();
            if (p.exitValue() != 0) {
                throw new RuntimeException("Process execution failed. Process returned exit value: " + p.exitValue() + " \n The standard output is\n" + output.toString());
            }
        } catch (Exception err) {
            err.printStackTrace();
        }
        return output.toString();
    }
}

class ProcessOutputReader implements Runnable {

    Process p;
    StringBuffer output;

    public ProcessOutputReader(Process p, StringBuffer output) {
        this.p = p;
        this.output = output;
    }

    public void run() {
        try {
            String line;
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null) {
                System.out.println("-----------"+line);
                output.append(line + "\n");
            }
            input.close();
        } catch (IOException ex) {
            Logger.getLogger(ProcessOutputReader.class.getName()).log(Level.SEVERE, "Error while reading output of the process!! ", ex);
        }

    }
}
