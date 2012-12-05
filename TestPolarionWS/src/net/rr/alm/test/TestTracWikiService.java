package net.rr.alm.test;

import net.rr.alm.wiki.IWikiService;
import net.rr.alm.wiki.PolarionWikiService;
import net.rr.alm.wiki.TracWikiService;
import net.rr.alm.wiki.WikiPage;

import org.junit.Before;
import org.junit.Test;

public class TestTracWikiService {
	private IWikiService tWikiService;
	private IWikiService pWikiService;

	@Before
	public void init() {
		tWikiService = new TracWikiService();
		pWikiService = new PolarionWikiService();
	}

	// @Test
	public void testSingleWikiPageFetch() {
		WikiPage page = pWikiService
				.getWikiPage("HowTo/FERRET Work Item HowTo");
		tWikiService.addWikiPage(page);
	}

	@Test
	public void testMultipleWikiPageInsert() {
		WikiPage page = pWikiService
				.getWikiPage("HowTo/Database Configuration");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("HowTo/FERRET Computation Node Installation Guide");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("HowTo/FERRET Import Process Installation HowTo");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("HowTo/FERRET Installation Overview");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("HowTo/FERRET Testing HowTo");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("HowTo/FERRET WebSphere Configuration");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("HowTo/FERRET Work Item HowTo");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("HowTo/Loading FERRET Master Data HowTo");
		tWikiService.addWikiPage(page);

		page = pWikiService.getWikiPage("Contact");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("DevelopmentHome");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("Home");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("How to manage Iterative Development Process");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("How to manage Project and Release Planning");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("How to manage Quality Assurance Process");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("How to manage Requirements Specification Process");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("IterationStatus");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("Linking Schema");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("macros");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("ProjectPlanningInfoCenter");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("QAProcessInfoCenter");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("ReleaseStatus");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("ReportProblemChangeRequest");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("RequirementsProcessInfoCenter");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("Settings");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("SetupProject");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("TaskBoard");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("TeamMembers");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("TestSummaryReportTemplate");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("tourpanel");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("UsefulLinks");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("Workflow Schema");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2010_11_19FerretPUGroup");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_01_11IdeasFERRET");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_02_04RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_02_25FerretPUGroup");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_03_07RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_03_18RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_04_08RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_04_15RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_05_13RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_05_20RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_05_27RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_07_08RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_07_26RekoFerretMitUlm");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_08_12RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_08_19RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_08_29RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_09_02RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_09_09RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_09_16RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_09_23RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_09_30RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_10_07RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_10_11RekoFerretMitUlm");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_10_21RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_10_26FinasSpecPKW");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_10_28RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_11_04RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_11_10TestingRekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_11_17_TestingRekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_11_18RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_11_25RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_11_25TestingRekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_12_01TestingRekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_12_08TestingRekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2011_12_13FerretRekoOrganisation");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_01_20RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_01_27RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_02_07 Testplanung");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_02_17_FerretRequirements Planning Release 12.2");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_02_24FerretRekoIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_03_09_FerretRekoIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_03_16 FerretRekoIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_03_20_FerretRekoManagement");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_03_23 FerretRekoIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_03_26DevelopmentWorkshopTestingFunctionsRel12.1");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_03_27_MigrationProduktivsystemReko");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_03_27_TeststatusHybridPKW");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_03_28_OrganisationalRetrospective");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_04_03_FerretRekoHybridPKW");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_04_11_AbstimmungAlias");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_04_13_FerretRekoIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_04_24_FerretStatusReKo");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_04_27_FerretRekoIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_05_03_FINASInterfaceSpezifikation");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_05_08_FerretReko");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_05_11_FerretReko");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_05_15_FerretReko_MBRDI");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_05_25_FerretReko_Intern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_05_29_Alias-Signalnamen_Umgang");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_06_22RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_06_30_FerretRekoIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_07_06_FerretRekoIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_07_12_FerretWorkshopE3Preparation");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_07_13_FerretRekoIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_07_27_FerretRekoIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_08_03_FerretRekoIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_08_10_FerretRekoIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_08_17_FerretRekoIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_08_31_FerretRekoIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_09_07_FerretRekoIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_09_21_FerretRekoIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_10_19RekoFerretIntern");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_11_19_FerretWorkshopKickOff");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_11_20_FerretWorkshopProgress");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_11_21_FerretWorkshopDailyMeeting");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_11_22_FerretWorksopDailyMeeting");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_11_23_FerretWorkshop");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_11_26_FerretWorkshop");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_11_30_FerretWorkshopStatus");
		tWikiService.addWikiPage(page);
		page = pWikiService
				.getWikiPage("Meeting Minutes/Meeting_2012_11_l28_FerretWorkshopStatus");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("Releases/Version12_1");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("Releases/Version12_2");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("Releases/Version12_3");
		tWikiService.addWikiPage(page);
		page = pWikiService.getWikiPage("Releases/Version12_4");
		tWikiService.addWikiPage(page);
	}

}
