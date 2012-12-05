package net.rr.alm.test;

import net.rr.alm.wiki.IWikiService;
import net.rr.alm.wiki.PolarionWikiService;
import net.rr.alm.wiki.WikiPage;

import org.junit.Before;
import org.junit.Test;

public class TestPolarionWikiService {

	private IWikiService wikiService;

	@Before
	public void init() {
		wikiService = new PolarionWikiService();
	}

	@Test
	public void testSingleWikiPageFetch() {
		WikiPage page = wikiService.getWikiPage("HowTo/FERRET Work Item HowTo");
		System.out.println(page.getWikiMarkup());
	}
}
