package https.webservices_sabre_com.websvc;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.3
 * 2015-09-29T23:22:17.003-03:00
 * Generated source version: 3.1.3
 * 
 */
@WebServiceClient(name = "SessionCreateRQService", 
                  wsdlLocation = "file:/home/oswald/workspaces/workspace-centauri/cocha/meta-search/mate-search/src/main/resources/wsdl/SessionCreateRQ.wsdl",
                  targetNamespace = "https://webservices.sabre.com/websvc") 
public class SessionCreateRQService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("https://webservices.sabre.com/websvc", "SessionCreateRQService");
    public final static QName SessionCreatePortType = new QName("https://webservices.sabre.com/websvc", "SessionCreatePortType");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/oswald/workspaces/workspace-centauri/cocha/meta-search/mate-search/src/main/resources/wsdl/SessionCreateRQ.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SessionCreateRQService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/oswald/workspaces/workspace-centauri/cocha/meta-search/mate-search/src/main/resources/wsdl/SessionCreateRQ.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SessionCreateRQService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SessionCreateRQService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SessionCreateRQService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SessionCreateRQService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SessionCreateRQService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SessionCreateRQService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SessionCreatePortType
     */
    @WebEndpoint(name = "SessionCreatePortType")
    public SessionCreatePortType getSessionCreatePortType() {
        return super.getPort(SessionCreatePortType, SessionCreatePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SessionCreatePortType
     */
    @WebEndpoint(name = "SessionCreatePortType")
    public SessionCreatePortType getSessionCreatePortType(WebServiceFeature... features) {
        return super.getPort(SessionCreatePortType, SessionCreatePortType.class, features);
    }

}
