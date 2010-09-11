// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   GmailUtils.java

package shinobi;

import com.sun.mail.pop3.POP3SSLStore;
import java.io.PrintStream;
import java.util.Date;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.ContentType;
import javax.mail.internet.ParseException;

public class GmailUtils
{

    public GmailUtils()
    {
        session = null;
        store = null;
    }

    public void setUserPass(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public void connect()
        throws Exception
    {
        String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
        Properties pop3Props = new Properties();
        pop3Props.setProperty("mail.pop3.socketFactory.class", SSL_FACTORY);
        pop3Props.setProperty("mail.pop3.socketFactory.fallback", "false");
        pop3Props.setProperty("mail.pop3.port", "995");
        pop3Props.setProperty("mail.pop3.socketFactory.port", "995");
        URLName url = new URLName("pop3", "pop.gmail.com", 995, "", username, password);
        session = Session.getInstance(pop3Props, null);
        store = new POP3SSLStore(session, url);
        store.connect();
    }

    public void openFolder(String folderName)
        throws Exception
    {
        folder = store.getDefaultFolder();
        folder = folder.getFolder(folderName);
        if(folder == null)
            throw new Exception("Invalid folder");
        try
        {
            folder.open(2);
        }
        catch(MessagingException ex)
        {
            folder.open(1);
        }
    }

    public void closeFolder()
        throws Exception
    {
        folder.close(false);
    }

    public int getMessageCount()
        throws Exception
    {
        return folder.getMessageCount();
    }

    public int getNewMessageCount()
        throws Exception
    {
        return folder.getNewMessageCount();
    }

    public void disconnect()
        throws Exception
    {
        store.close();
    }

    public void printMessage(int messageNo)
        throws Exception
    {
        System.out.println((new StringBuilder("Getting message number: ")).append(messageNo).toString());
        Message m = null;
        try
        {
            m = folder.getMessage(messageNo);
            dumpPart(m);
        }
        catch(IndexOutOfBoundsException iex)
        {
            System.out.println("Message number out of range");
        }
    }

    public void printAllMessageEnvelopes()
        throws Exception
    {
        Message msgs[] = folder.getMessages();
        FetchProfile fp = new FetchProfile();
        fp.add(javax.mail.FetchProfile.Item.ENVELOPE);
        folder.fetch(msgs, fp);
        for(int i = 0; i < msgs.length; i++)
        {
            System.out.println("--------------------------");
            System.out.println((new StringBuilder("MESSAGE #")).append(i + 1).append(":").toString());
            dumpEnvelope(msgs[i]);
        }

    }

    public void printAllMessages()
        throws Exception
    {
        Message msgs[] = folder.getMessages();
        FetchProfile fp = new FetchProfile();
        fp.add(javax.mail.FetchProfile.Item.ENVELOPE);
        folder.fetch(msgs, fp);
        for(int i = 0; i < msgs.length; i++)
        {
            System.out.println("--------------------------");
            System.out.println((new StringBuilder("MESSAGE #")).append(i + 1).append(":").toString());
            dumpPart(msgs[i]);
        }

    }

    public static void dumpPart(Part p)
        throws Exception
    {
        if(p instanceof Message)
            dumpEnvelope((Message)p);
        String ct = p.getContentType();
        try
        {
            pr((new StringBuilder("CONTENT-TYPE: ")).append((new ContentType(ct)).toString()).toString());
        }
        catch(ParseException pex)
        {
            pr((new StringBuilder("BAD CONTENT-TYPE: ")).append(ct).toString());
        }
        if(p.isMimeType("text/plain"))
        {
            pr("This is plain text");
            pr("---------------------------");
            System.out.println((String)p.getContent());
        } else
        {
            pr("---------------------------");
        }
    }

    public static void dumpEnvelope(Message m)
        throws Exception
    {
        pr(" ");
        Address a[];
        if((a = m.getFrom()) != null)
        {
            for(int j = 0; j < a.length; j++)
                pr((new StringBuilder("FROM: ")).append(a[j].toString()).toString());

        }
        if((a = m.getRecipients(javax.mail.Message.RecipientType.TO)) != null)
        {
            for(int j = 0; j < a.length; j++)
                pr((new StringBuilder("TO: ")).append(a[j].toString()).toString());

        }
        pr((new StringBuilder("SUBJECT: ")).append(m.getSubject()).toString());
        Date d = m.getSentDate();
        pr((new StringBuilder("SendDate: ")).append(d == null ? "UNKNOWN" : d.toString()).toString());
    }

    public static void pr(String s)
    {
        System.out.print(indentStr.substring(0, level * 2));
        System.out.println(s);
    }

    private Session session;
    private Store store;
    private String username;
    private String password;
    private Folder folder;
    static String indentStr = "                                               ";
    static int level = 0;

}
