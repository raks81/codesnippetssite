package net.rr.alm.wiki;

import java.util.List;

public interface IWikiService {
	public List<WikiPage> getWikiPages();

	public WikiPage getWikiPage(String name);

	public void addWikiPage(WikiPage wiki);
}
