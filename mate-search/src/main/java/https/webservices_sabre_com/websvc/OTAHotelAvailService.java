package https.webservices_sabre_com.websvc;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.3 2015-10-07T17:44:40.699-03:00
 * Generated source version: 3.1.3
 * 
 */
@WebServiceClient(name = "OTA_HotelAvailService", wsdlLocation = "file:/home/viken/workspace/meta-search/mate-search/src/main/resources/wsdl/OTA_HotelAvailLLS2.2.0RQ.wsdl", targetNamespace = "https://webservices.sabre.com/websvc")
public class OTAHotelAvailService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("https://webservices.sabre.com/websvc", "OTA_HotelAvailService");
    public final static QName OTAHotelAvailPortType = new QName("https://webservices.sabre.com/websvc",
            "OTA_HotelAvailPortType");
    static {
        URL url = null;
        try {
            url = new URL(
                    "file:/home/viken/workspace/meta-search/mate-search/src/main/resources/wsdl/OTA_HotelAvailLLS2.2.0RQ.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger
                    .getLogger(OTAHotelAvailService.class.getName())
                    .log(java.util.logging.Level.INFO, "Can not initialize the default wsdl from {0}",
                            "file:/home/viken/workspace/meta-search/mate-search/src/main/resources/wsdl/OTA_HotelAvailLLS2.2.0RQ.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OTAHotelAvailService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OTAHotelAvailService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OTAHotelAvailService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public OTAHotelAvailService(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public OTAHotelAvailService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public OTAHotelAvailService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return returns OTAHotelAvailPortType
     */
    @WebEndpoint(name = "OTA_HotelAvailPortType")
    public OTAHotelAvailPortType getOTAHotelAvailPortType() {
        return super.getPort(OTAHotelAvailPortType, OTAHotelAvailPortType.class);
    }

    /**
     * 
     * @param features
     *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
     *            on the proxy. Supported features not in the
     *            <code>features</code> parameter will have their default
     *            values.
     * @return returns OTAHotelAvailPortType
     */
    @WebEndpoint(name = "OTA_HotelAvailPortType")
    public OTAHotelAvailPortType getOTAHotelAvailPortType(WebServiceFeature... features) {
        return super.getPort(OTAHotelAvailPortType, OTAHotelAvailPortType.class, features);
    }

}
