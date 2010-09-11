// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ZipUtils.java

package shinobi;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipUtils extends Thread
{

    public ZipUtils()
    {
    }

    public static void zipFileSeries(String filePrefix, String extension, int startIndex, int endIndex, String outputFileName)
    {
        String filesToZip[] = new String[endIndex - startIndex];
        for(int i = startIndex; i < endIndex; i++)
        {
            filesToZip[i] = (new StringBuilder(String.valueOf(filePrefix))).append(i).toString();
            if(extension != null && !"".equalsIgnoreCase(extension))
                filesToZip[i] = (new StringBuilder(String.valueOf(filesToZip[i]))).append(".").append(extension).toString();
        }

        byte buffer[] = new byte[18024];
        String zipFileName = outputFileName;
        try
        {
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
            out.setLevel(-1);
            for(int i = 0; i < filesToZip.length; i++)
            {
                System.out.println(i);
                FileInputStream in = new FileInputStream(filesToZip[i]);
                out.putNextEntry(new ZipEntry(filesToZip[i]));
                int len;
                while((len = in.read(buffer)) > 0) 
                    out.write(buffer, 0, len);
                out.closeEntry();
                in.close();
            }

            out.close();
        }
        catch(IllegalArgumentException iae)
        {
            iae.printStackTrace();
        }
        catch(FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
