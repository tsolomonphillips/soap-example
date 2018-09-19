package com.solstice.javatraining.client;

import com.solstice.javatraining.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class HelloWorldClient
{
    public static void main(String[] args) throws Exception
    {
        URL url = new URL("http://localhost:9999/ws/hello?wsdl");
        QName qName = new QName("http://javatraining.solstice.com/", "HelloWorldImplService");

        Service service = Service.create(url, qName);
        HelloWorld hello = service.getPort(HelloWorld.class);
        System.out.println(hello.getHelloWorldAsString("solstice"));

    }
}
