package com.rr.appdeployer;

import java.io.IOException;
import java.util.Properties;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author raks
 */
public class Worker implements Runnable {

    String branchName;
    String serverName;
    Properties props = new Properties();
    private static final String SVN_UPDATE_COMMAND = "svn update *";

    public Worker(String branchName, String serverName) throws IOException {
        this.branchName = branchName;
        this.serverName = serverName;

        //Load the props file
        props = new java.util.Properties();
        String path = getClass().getProtectionDomain().getCodeSource().
                getLocation().toString().substring(6);
        java.io.FileInputStream fis = new java.io.FileInputStream(new java.io.File(path + "/appdeployer.props"));
        props.load(fis);
        fis.close();

    }

    public void run() {
        //Go to the path where code is  checked out
        String branchPath = props.getProperty(branchName + ".path");
        //Perform SVN Update
        String op = ProcessRunner.executeProcess(branchPath + "/" + SVN_UPDATE_COMMAND);
        System.out.println("Output of "+SVN_UPDATE_COMMAND+"\n"+op);

        //Go to EAR

        //Build the EAR



        //Load the app server properties


        //Deploy the EAR
    }
}
