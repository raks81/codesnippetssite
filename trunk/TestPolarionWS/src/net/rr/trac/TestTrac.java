package net.rr.trac;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.lustin.trac.xmlprc.Ticket;
import org.lustin.trac.xmlprc.TrackerDynamicProxy;
import org.lustin.trac.xmlprc.Wiki;

public class TestTrac {
	public static void main(String[] args) throws MalformedURLException {
		XmlRpcClientConfigImpl conf = new XmlRpcClientConfigImpl();
		conf.setBasicUserName("raks");
		conf.setBasicPassword("rakz123");
		conf.setServerURL(new URL("http://localhost:8081/test/login/rpc"));
		XmlRpcClient client = new XmlRpcClient();
		client.setConfig(conf);
		TrackerDynamicProxy proxy = new TrackerDynamicProxy(client);
		
//		Wiki wiki = (Wiki) proxy.newInstance(Wiki.class);
//		Hashtable<String, String> h = new Hashtable<String, String>();
//		wiki.putPage("MyPage1", "Some content", h);
		
		Ticket ticket = (Ticket) proxy.newInstance(Ticket.class);
//		ticket.create("test ticket", "Ticke is a test");
		Vector v = ticket.get(1);
		System.out.println(v);
		System.out.println(ticket);
		
		
		
	}
}
