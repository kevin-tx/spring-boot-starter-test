package com.kevin;

/**
 * @author TX
 * @date 2021/12/14 20:14
 */
public class HelloService {
    HelloProperties helloProperties;
    public HelloProperties getHelloProperties() {
        return helloProperties;
    }
    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
    public String sayHello(String name) {
        return helloProperties.getPrefix() + "-" + name + helloProperties.getSuffix();
    }
}
