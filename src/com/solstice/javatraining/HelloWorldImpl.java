package com.solstice.javatraining;

import javax.jws.WebService;

@WebService(endpointInterface = "com.solstice.javatraining.HelloWorld")
public class HelloWorldImpl implements HelloWorld
{

    @Override
    public String getHelloWorldAsString(String name)
    {
        return "Hello World JAX-WS " + name;
    }
}
