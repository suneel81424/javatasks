/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.spring;

import javax.annotation.PostConstruct;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author suneelkumar.a
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.imi");
        applicationContext.getBean(ServceTest.class).test("paytm");
        applicationContext.getBean(ServceTest.class).test("phonepe");
    }

    
}
