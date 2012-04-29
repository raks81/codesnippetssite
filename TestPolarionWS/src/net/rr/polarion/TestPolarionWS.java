package net.rr.polarion;

import java.net.MalformedURLException;

import com.polarion.alm.ws.client.WebServiceFactory;
import com.polarion.alm.ws.client.projects.ProjectWebService;
import com.polarion.alm.ws.client.session.SessionWebService;
import com.polarion.alm.ws.client.tracker.TrackerWebService;

public class TestPolarionWS {

	private SessionWebService sessionService;
	private TrackerWebService trackerService;
	private ProjectWebService projectService;

	private WebServiceFactory factory;
	
	private void setUpPolarionAddress() throws MalformedURLException {
		StringBuffer buf = new StringBuffer();
//		buf.append(prop.getProperty("polarion_server_address")).append(":")
//				.append(prop.getProperty("polarion_server_port")).append(
//						"/polarion/ws/services/");

		factory = new WebServiceFactory(buf.toString());
	}
	
	
	public static void main(String[] args) {

	}
}
