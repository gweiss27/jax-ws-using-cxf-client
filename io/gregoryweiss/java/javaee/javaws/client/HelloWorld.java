
package io.gregoryweiss.java.javaee.javaws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorld", targetNamespace = "http://service.javaws.javaee.java.gregoryweiss.io/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorld {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://service.javaws.javaee.java.gregoryweiss.io/", className = "io.gregoryweiss.java.javaee.javaws.client.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://service.javaws.javaee.java.gregoryweiss.io/", className = "io.gregoryweiss.java.javaee.javaws.client.SayHelloResponse")
    public String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
