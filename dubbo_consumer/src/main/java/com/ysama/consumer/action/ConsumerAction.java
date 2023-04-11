package com.ysama.consumer.action;

import com.ysama.dubbo_interface.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("consumerAction")
public class ConsumerAction
{
    @Autowired
    private HelloService helloService;

    public String doSayHello(String name) {
        return helloService.sayHello(name);
    }
}
