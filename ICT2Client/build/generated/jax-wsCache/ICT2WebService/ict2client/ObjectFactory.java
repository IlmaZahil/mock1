
package ict2client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ict2client package. 
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

    private final static QName _Exception_QNAME = new QName("http://server/", "Exception");
    private final static QName _GetLargestDoubleOnServerResponse_QNAME = new QName("http://server/", "getLargestDoubleOnServerResponse");
    private final static QName _SafeDivideResponse_QNAME = new QName("http://server/", "safeDivideResponse");
    private final static QName _DivideResponse_QNAME = new QName("http://server/", "divideResponse");
    private final static QName _GetLargestDoubleOnServer_QNAME = new QName("http://server/", "getLargestDoubleOnServer");
    private final static QName _IsConnected_QNAME = new QName("http://server/", "isConnected");
    private final static QName _SafeDivide_QNAME = new QName("http://server/", "safeDivide");
    private final static QName _AddDoubleOnServer_QNAME = new QName("http://server/", "addDoubleOnServer");
    private final static QName _AddDoubleOnServerResponse_QNAME = new QName("http://server/", "addDoubleOnServerResponse");
    private final static QName _IsConnectedResponse_QNAME = new QName("http://server/", "isConnectedResponse");
    private final static QName _Divide_QNAME = new QName("http://server/", "divide");
    private final static QName _Hello_QNAME = new QName("http://server/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://server/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ict2client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddDoubleOnServer }
     * 
     */
    public AddDoubleOnServer createAddDoubleOnServer() {
        return new AddDoubleOnServer();
    }

    /**
     * Create an instance of {@link AddDoubleOnServerResponse }
     * 
     */
    public AddDoubleOnServerResponse createAddDoubleOnServerResponse() {
        return new AddDoubleOnServerResponse();
    }

    /**
     * Create an instance of {@link SafeDivide }
     * 
     */
    public SafeDivide createSafeDivide() {
        return new SafeDivide();
    }

    /**
     * Create an instance of {@link GetLargestDoubleOnServer }
     * 
     */
    public GetLargestDoubleOnServer createGetLargestDoubleOnServer() {
        return new GetLargestDoubleOnServer();
    }

    /**
     * Create an instance of {@link IsConnected }
     * 
     */
    public IsConnected createIsConnected() {
        return new IsConnected();
    }

    /**
     * Create an instance of {@link SafeDivideResponse }
     * 
     */
    public SafeDivideResponse createSafeDivideResponse() {
        return new SafeDivideResponse();
    }

    /**
     * Create an instance of {@link DivideResponse }
     * 
     */
    public DivideResponse createDivideResponse() {
        return new DivideResponse();
    }

    /**
     * Create an instance of {@link GetLargestDoubleOnServerResponse }
     * 
     */
    public GetLargestDoubleOnServerResponse createGetLargestDoubleOnServerResponse() {
        return new GetLargestDoubleOnServerResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Divide }
     * 
     */
    public Divide createDivide() {
        return new Divide();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link IsConnectedResponse }
     * 
     */
    public IsConnectedResponse createIsConnectedResponse() {
        return new IsConnectedResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLargestDoubleOnServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getLargestDoubleOnServerResponse")
    public JAXBElement<GetLargestDoubleOnServerResponse> createGetLargestDoubleOnServerResponse(GetLargestDoubleOnServerResponse value) {
        return new JAXBElement<GetLargestDoubleOnServerResponse>(_GetLargestDoubleOnServerResponse_QNAME, GetLargestDoubleOnServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SafeDivideResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "safeDivideResponse")
    public JAXBElement<SafeDivideResponse> createSafeDivideResponse(SafeDivideResponse value) {
        return new JAXBElement<SafeDivideResponse>(_SafeDivideResponse_QNAME, SafeDivideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "divideResponse")
    public JAXBElement<DivideResponse> createDivideResponse(DivideResponse value) {
        return new JAXBElement<DivideResponse>(_DivideResponse_QNAME, DivideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLargestDoubleOnServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getLargestDoubleOnServer")
    public JAXBElement<GetLargestDoubleOnServer> createGetLargestDoubleOnServer(GetLargestDoubleOnServer value) {
        return new JAXBElement<GetLargestDoubleOnServer>(_GetLargestDoubleOnServer_QNAME, GetLargestDoubleOnServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsConnected }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "isConnected")
    public JAXBElement<IsConnected> createIsConnected(IsConnected value) {
        return new JAXBElement<IsConnected>(_IsConnected_QNAME, IsConnected.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SafeDivide }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "safeDivide")
    public JAXBElement<SafeDivide> createSafeDivide(SafeDivide value) {
        return new JAXBElement<SafeDivide>(_SafeDivide_QNAME, SafeDivide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDoubleOnServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addDoubleOnServer")
    public JAXBElement<AddDoubleOnServer> createAddDoubleOnServer(AddDoubleOnServer value) {
        return new JAXBElement<AddDoubleOnServer>(_AddDoubleOnServer_QNAME, AddDoubleOnServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDoubleOnServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addDoubleOnServerResponse")
    public JAXBElement<AddDoubleOnServerResponse> createAddDoubleOnServerResponse(AddDoubleOnServerResponse value) {
        return new JAXBElement<AddDoubleOnServerResponse>(_AddDoubleOnServerResponse_QNAME, AddDoubleOnServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsConnectedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "isConnectedResponse")
    public JAXBElement<IsConnectedResponse> createIsConnectedResponse(IsConnectedResponse value) {
        return new JAXBElement<IsConnectedResponse>(_IsConnectedResponse_QNAME, IsConnectedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Divide }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "divide")
    public JAXBElement<Divide> createDivide(Divide value) {
        return new JAXBElement<Divide>(_Divide_QNAME, Divide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
