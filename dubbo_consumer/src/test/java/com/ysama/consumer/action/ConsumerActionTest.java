package com.ysama.consumer.action;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConsumerActionTest {

    @Autowired
    ConsumerAction action;

    @Test
    void doSayHello() {
        String hello = action.doSayHello("kikukaji");

        System.out.println(hello);
    }
}