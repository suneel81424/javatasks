/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.spring;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author suneelkumar.a
 */
@Configuration
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ServceTest {

    @Resource(name = "paytm")
    private Payment p;
    private final ApplicationContext applicationContext;

    public ServceTest(ApplicationContext applicationContext) {
        System.out.println("ServceTest");
        this.applicationContext = applicationContext;
    }

    @PostConstruct
    public void init() {
        System.out.println(p.process());

    }

    public void test(String provider) {
        System.out.println(applicationContext.getBean(provider, Payment.class).process());
    }
    @Bean
    public Payment paytm2() {
        System.out.println("@bena");
        return new Paytm();
    }
    @PostConstruct
    public void init2(){
        System.out.println("init");
    }
}
