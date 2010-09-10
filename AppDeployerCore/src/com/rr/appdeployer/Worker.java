package com.rr.appdeployer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author raks
 */
public class Worker implements Runnable {

    private static final Logger log = Logger.getLogger(Worker.class.getName());
    String branchName;
    String serverName;
    Properties props = new Properties();
    private static final String SVN_UPDATE_COMMAND = "svn update ";
    private static final String BUILD_EAR_COMMAND = "ant";

    public Worker(String branchName, String serverName) throws IOException {
        log.info("Creating new worker to build branch: " + branchName + " and deploy to App server running on port " + serverName);
        this.branchName = branchName;
        this.serverName = serverName;

        String propFilePath = System.getProperty("user.dir") + "/appdeployer.props";
        log.info("Loading properties from " + propFilePath);
        //Load the props file
        props.load(new FileInputStream(propFilePath));
        log.info("Instantiated new worker");

    }

    public void run() {
        log.info("Starting the task");
                
        //Perform SVN Update
        String branchPath = props.getProperty("branches." + branchName + ".path");
        //String svnUpdateCommand = SVN_UPDATE_COMMAND + branchPath;
        log.info("Performing svn update on " + branchPath + " by running:\n" + SVN_UPDATE_COMMAND);
        String op = ProcessRunner.executeProcess(SVN_UPDATE_COMMAND, new File(branchPath), System.out);
        log.info("SVN update completed successfully");

        //Build the EAR
        String earPath = branchPath+"/EAR";
        log.info("Building EAR");
        ProcessRunner.executeProcess(BUILD_EAR_COMMAND, new File(earPath), System.out);
        log.info("EAR built successfully");
        
        //Load the app server properties
        

        //Deploy the EAR
    }
}
