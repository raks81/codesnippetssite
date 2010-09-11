// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SecurityUtils.java

package shinobi;

import java.io.*;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;

class DesEncrypter
{

    DesEncrypter(SecretKey key)
    {
        buf = new byte[1024];
        byte iv[] = {
            -114, 18, 57, -100, 7, 114, 111, 90
        };
        java.security.spec.AlgorithmParameterSpec paramSpec = new IvParameterSpec(iv);
        try
        {
            ecipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            dcipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            ecipher.init(1, key, paramSpec);
            dcipher.init(2, key, paramSpec);
        }
        catch(InvalidAlgorithmParameterException invalidalgorithmparameterexception) { }
        catch(NoSuchPaddingException nosuchpaddingexception) { }
        catch(NoSuchAlgorithmException nosuchalgorithmexception) { }
        catch(InvalidKeyException invalidkeyexception) { }
    }

    public void encrypt(InputStream in, OutputStream out)
    {
        try
        {
            out = new CipherOutputStream(out, ecipher);
            for(int numRead = 0; (numRead = in.read(buf)) >= 0;)
                out.write(buf, 0, numRead);

            out.close();
        }
        catch(IOException ioexception) { }
    }

    public void decrypt(InputStream in, OutputStream out)
    {
        try
        {
            in = new CipherInputStream(in, dcipher);
            for(int numRead = 0; (numRead = in.read(buf)) >= 0;)
                out.write(buf, 0, numRead);

            out.close();
        }
        catch(IOException ioexception) { }
    }

    Cipher ecipher;
    Cipher dcipher;
    byte buf[];
}
