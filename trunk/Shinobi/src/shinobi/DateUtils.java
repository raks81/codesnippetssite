// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DateUtils.java

package shinobi;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtils
{

    public DateUtils()
    {
    }

    public static String getDate(String format)
    {
        String date = "";
        try
        {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
            date = simpleDateFormat.format(Calendar.getInstance().getTime());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return date;
    }
}
