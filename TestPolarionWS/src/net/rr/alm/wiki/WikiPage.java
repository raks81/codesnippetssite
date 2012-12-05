package net.rr.alm.wiki;

public class WikiPage {
	private String rawContents;

	private String wikiMarkup;

	private String pageName;

	public String getRawContents() {
		return rawContents;
	}

	public void setRawContents(String rawContents) {
		this.rawContents = rawContents;
	}

	public String getWikiMarkup() {
		return wikiMarkup;
	}

	public void setWikiMarkup(String wikiMarkup) {
		this.wikiMarkup = wikiMarkup;
	}

	public String getPageName() {
		return pageName != null ? pageName.replaceAll(" ", "") : "";
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	@Override
	public String toString() {
		return getWikiMarkup();
	}
}
