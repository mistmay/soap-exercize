
package com.advancia.wsImport2.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "IdCardServiceImplService", targetNamespace = "http://service.idCardSoap.advancia.com/", wsdlLocation = "file:/C:/Users/juzep/eclipse-workspace/wsImport2/src/main/resources/wsdl/IdCardServiceWSDL.wsdl")
public class IdCardServiceImplService
    extends Service
{

    private final static URL IDCARDSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException IDCARDSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName IDCARDSERVICEIMPLSERVICE_QNAME = new QName("http://service.idCardSoap.advancia.com/", "IdCardServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/juzep/eclipse-workspace/wsImport2/src/main/resources/wsdl/IdCardServiceWSDL.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IDCARDSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        IDCARDSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public IdCardServiceImplService() {
        super(__getWsdlLocation(), IDCARDSERVICEIMPLSERVICE_QNAME);
    }

    public IdCardServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), IDCARDSERVICEIMPLSERVICE_QNAME, features);
    }

    public IdCardServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, IDCARDSERVICEIMPLSERVICE_QNAME);
    }

    public IdCardServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IDCARDSERVICEIMPLSERVICE_QNAME, features);
    }

    public IdCardServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IdCardServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IdCardServiceImpl
     */
    @WebEndpoint(name = "IdCardServiceImplPort")
    public IdCardServiceImpl getIdCardServiceImplPort() {
        return super.getPort(new QName("http://service.idCardSoap.advancia.com/", "IdCardServiceImplPort"), IdCardServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IdCardServiceImpl
     */
    @WebEndpoint(name = "IdCardServiceImplPort")
    public IdCardServiceImpl getIdCardServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.idCardSoap.advancia.com/", "IdCardServiceImplPort"), IdCardServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IDCARDSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw IDCARDSERVICEIMPLSERVICE_EXCEPTION;
        }
        return IDCARDSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}