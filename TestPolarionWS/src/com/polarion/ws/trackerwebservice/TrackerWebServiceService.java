
package com.polarion.ws.trackerwebservice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * 
 * 
 *       This service provides tracker related functionallity.
 * 		  
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "TrackerWebServiceService", targetNamespace = "http://ws.polarion.com/TrackerWebService", wsdlLocation = "http://community.polarion.org/polarion/ws/services/TrackerWebService?wsdl")
public class TrackerWebServiceService
    extends Service
{

    private final static URL TRACKERWEBSERVICESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.polarion.ws.trackerwebservice.TrackerWebServiceService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.polarion.ws.trackerwebservice.TrackerWebServiceService.class.getResource(".");
            url = new URL(baseUrl, "http://community.polarion.org/polarion/ws/services/TrackerWebService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://community.polarion.org/polarion/ws/services/TrackerWebService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        TRACKERWEBSERVICESERVICE_WSDL_LOCATION = url;
    }

    public TrackerWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TrackerWebServiceService() {
        super(TRACKERWEBSERVICESERVICE_WSDL_LOCATION, new QName("http://ws.polarion.com/TrackerWebService", "TrackerWebServiceService"));
    }

    /**
     * 
     * @return
     *     returns TrackerWebService
     */
    @WebEndpoint(name = "TrackerWebService")
    public TrackerWebService getTrackerWebService() {
        return super.getPort(new QName("http://ws.polarion.com/TrackerWebService", "TrackerWebService"), TrackerWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TrackerWebService
     */
    @WebEndpoint(name = "TrackerWebService")
    public TrackerWebService getTrackerWebService(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.polarion.com/TrackerWebService", "TrackerWebService"), TrackerWebService.class, features);
    }

}
