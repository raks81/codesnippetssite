// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SecurityUtils.java

package shinobi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.crypto.KeyGenerator;

// Referenced classes of package org.rr.util:
//            DesEncrypter

public class SecurityUtils
{

    public SecurityUtils()
    {
    }

    public static void encryptFile(String clearTextFileName, String encyptedFileName, String keyString)
    {
        try
        {
            javax.crypto.SecretKey key = KeyGenerator.getInstance(keyString).generateKey();
            DesEncrypter encrypter = new DesEncrypter(key);
            encrypter.encrypt(new FileInputStream(clearTextFileName), new FileOutputStream(encyptedFileName));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void decryptFile(String clearTextFileName, String encyptedFileName, String keyString)
    {
        try
        {
            javax.crypto.SecretKey key = KeyGenerator.getInstance(keyString).generateKey();
            DesEncrypter encrypter = new DesEncrypter(key);
            encrypter.decrypt(new FileInputStream(encyptedFileName), new FileOutputStream(clearTextFileName));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
