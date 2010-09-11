// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Screenshot.java

package shinobi;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.PrintStream;
import javax.imageio.ImageIO;

public class Screenshot extends Thread
{

    public Screenshot()
    {
    }

    public static void takeScreenshot(String args[])
        throws Exception
    {
        if(args.length != 2)
        {
            System.err.println("Usage: java Screenshot WAITSECONDS OUTFILE.png");
            System.exit(1);
        }
        String outFileName = args[1];
        try
        {
            long time = Long.parseLong(args[0]) * 1000L;
            System.out.println((new StringBuilder("Waiting ")).append(time / 1000L).append(" second(s)...").toString());
            Thread.sleep(time);
        }
        catch(NumberFormatException nfe)
        {
            System.err.println((new StringBuilder(String.valueOf(args[0]))).append(" does not seem to be a ").append("valid number of seconds.").toString());
            System.exit(1);
        }
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        java.awt.Dimension screenSize = toolkit.getScreenSize();
        Rectangle screenRect = new Rectangle(screenSize);
        Robot robot = new Robot();
        BufferedImage image = robot.createScreenCapture(screenRect);
        ImageIO.write(image, "gif", new File(outFileName));
        System.out.println((new StringBuilder("Saved screen shot (")).append(image.getWidth()).append(" x ").append(image.getHeight()).append(" pixels) to file \"").append(outFileName).append("\".").toString());
    }
}
