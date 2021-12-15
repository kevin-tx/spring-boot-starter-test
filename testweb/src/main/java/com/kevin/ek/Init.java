package com.kevin.ek;

import com.kevin.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author TX
 * @date 2021/12/14 20:27
 */

@Component
public class Init {

    @Autowired
    private HelloService helloService;

    @PostConstruct
    public void init(){
        System.out.println("======================" + helloService.sayHello("Messi"));
    }
}
