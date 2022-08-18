
package com.advancia.wsImport2.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.advancia.wsImport2.ws.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetIdCardList_QNAME = new QName("http://service.idCardSoap.advancia.com/", "getIdCardList");
    private final static QName _GetIdCardListResponse_QNAME = new QName("http://service.idCardSoap.advancia.com/", "getIdCardListResponse");
    private final static QName _IdCard_QNAME = new QName("http://service.idCardSoap.advancia.com/", "idCard");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.advancia.wsImport2.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetIdCardList }
     * 
     */
    public GetIdCardList createGetIdCardList() {
        return new GetIdCardList();
    }

    /**
     * Create an instance of {@link GetIdCardListResponse }
     * 
     */
    public GetIdCardListResponse createGetIdCardListResponse() {
        return new GetIdCardListResponse();
    }

    /**
     * Create an instance of {@link IdCard }
     * 
     */
    public IdCard createIdCard() {
        return new IdCard();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdCardList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetIdCardList }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.idCardSoap.advancia.com/", name = "getIdCardList")
    public JAXBElement<GetIdCardList> createGetIdCardList(GetIdCardList value) {
        return new JAXBElement<GetIdCardList>(_GetIdCardList_QNAME, GetIdCardList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdCardListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetIdCardListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.idCardSoap.advancia.com/", name = "getIdCardListResponse")
    public JAXBElement<GetIdCardListResponse> createGetIdCardListResponse(GetIdCardListResponse value) {
        return new JAXBElement<GetIdCardListResponse>(_GetIdCardListResponse_QNAME, GetIdCardListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdCard }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdCard }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.idCardSoap.advancia.com/", name = "idCard")
    public JAXBElement<IdCard> createIdCard(IdCard value) {
        return new JAXBElement<IdCard>(_IdCard_QNAME, IdCard.class, null, value);
    }

}
