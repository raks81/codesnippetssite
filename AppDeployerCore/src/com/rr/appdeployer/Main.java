/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rr.appdeployer;

import java.io.IOException;

/**
 *
 * @author raks
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Thread t = new Thread(new Worker("trunk", "9080"));
        t.start();
    }

}
