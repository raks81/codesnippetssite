package net.rr.alm.wiki;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.commons.lang.StringUtils;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import org.lustin.trac.xmlprc.TrackerDynamicProxy;
import org.lustin.trac.xmlprc.Wiki;

public class TracWikiService implements IWikiService {

	private static final String WIKI_START_PAGE = "WikiStart";

	private static final Logger LOG = Logger.getLogger(TracWikiService.class
			.getName());

	private Properties prop = new Properties();

	private Wiki wikiService = null;

	public TracWikiService() {
		try {
			prop.load(new FileInputStream("settings.properties"));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		wikiService = getWikiService();
	}

	@Override
	public List<WikiPage> getWikiPages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WikiPage getWikiPage(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addWikiPage(WikiPage wiki) {
		LOG.info("Adding page " + wiki.getPageName() + " to trac...");
		Hashtable<String, String> params = new Hashtable<String, String>();
		params.put("comment", "Added page " + wiki.getPageName());
		wikiService.deletePage(wiki.getPageName());
		wikiService.putPage(wiki.getPageName(), wiki.getWikiMarkup(), params);

		// Update the wikistart page
		String wikiLink = "[wiki:" + wiki.getPageName() + " "
				+ wiki.getPageName() + "]";
		String wikiStartPageMarkup = wikiService.getPage(WIKI_START_PAGE);
		if (!StringUtils.contains(wikiStartPageMarkup, wikiLink)) {
			wikiStartPageMarkup += wikiLink + "[[BR]]\n";
			wikiService.putPage(WIKI_START_PAGE, wikiStartPageMarkup, params);
		}
	}

	private Wiki getWikiService() {
		XmlRpcClientConfigImpl conf = new XmlRpcClientConfigImpl();
		conf.setBasicUserName(prop.getProperty("tracuser"));
		conf.setBasicPassword(prop.getProperty("tracpwd"));
		try {
			conf.setServerURL(new URL(prop.getProperty("tracrpcurl")));
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
		XmlRpcClient client = new XmlRpcClient();
		client.setConfig(conf);
		TrackerDynamicProxy proxy = new TrackerDynamicProxy(client);

		return (Wiki) proxy.newInstance(Wiki.class);

	}
}
