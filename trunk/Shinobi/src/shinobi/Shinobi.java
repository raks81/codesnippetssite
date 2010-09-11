// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Shinobi.java

package shinobi;

import com.gif4j.light.*;
import java.io.*;
import java.util.Calendar;
import javax.imageio.ImageIO;

// Referenced classes of package org.rr.shinobi:
//            Screenshot

public class Shinobi
{

    public Shinobi()
    {
    }

    public static void main(String args[])
    {
        try
        {
            int sanityCount = 0;
            do
            {
                for(int i = 0; i <= MAX_ITERATION_COUNT - 1; i++)
                {
                    String sarg[] = {
                        SCREENSHOT_DELAY, (new StringBuilder(String.valueOf(OUTPUT_FILE_PREFIX))).append(i).append(".gif").toString()
                    };
                    Screenshot.takeScreenshot(sarg);
                }

                ZipUtils.zipFileSeries(OUTPUT_FILE_PREFIX, "gif", 0, MAX_ITERATION_COUNT, (new StringBuilder(String.valueOf(FINAL_FILENAME_PREFIX))).append(sanityCount).toString());
                if(sanityCount > SANITY_CHECK_COUNT)
                    break;
                sanityCount++;
            } while(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void saveImageArrayAsAnimatedGif()
        throws IOException
    {
        GifImage gifImage = new GifImage();
        gifImage.setDefaultDelay(500);
        for(int i = 0; i < MAX_ITERATION_COUNT; i++)
            try
            {
                java.awt.Image image = ImageIO.read(new File((new StringBuilder(String.valueOf(OUTPUT_FILE_PREFIX))).append(i).toString()));
                gifImage.addGifFrame(new GifFrame(image));
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }

        GifEncoder.encode(gifImage, new File((new StringBuilder(String.valueOf(FINAL_FILENAME_PREFIX))).append(" ").append(getTimeStamp()).append(".gif").toString()));
    }

    private static String getTimeStamp()
    {
        Calendar calendar = Calendar.getInstance();
        StringBuffer dateString = new StringBuffer();
        dateString.append(calendar.get(3));
        dateString.append("-");
        dateString.append(calendar.get(5));
        dateString.append("-");
        dateString.append(calendar.get(11));
        dateString.append("-");
        dateString.append(calendar.get(12));
        System.err.println(dateString);
        return dateString.toString();
    }

    private static int MAX_ITERATION_COUNT;
    private static String OUTPUT_FILE_PREFIX = "out";
    private static String SCREENSHOT_DELAY = "10";
    private static String FINAL_FILENAME_PREFIX = "fout";
    private static int SANITY_CHECK_COUNT;

    static 
    {
        MAX_ITERATION_COUNT = 180;
        SANITY_CHECK_COUNT = MAX_ITERATION_COUNT * 100;
    }
}
