/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rr.appdeployer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author raks
 */
public class ProcessRunner { 

    public static String executeProcess(String path, StringBuffer output) {
        try {
            String line;
            Process p = Runtime.getRuntime().exec(path);
            BufferedReader input =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null ) {
                output.append(line + "\n");
            }
            input.close();
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
