/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.spring;

import org.springframework.context.annotation.Configuration;

/**
 *
 * @author suneelkumar.a
 */
@Configuration("phonepe")
public class PhonePe implements Payment{

    public PhonePe() {
        System.out.println("PhonePe");
    }

    @Override
    public String process() {
        return "Payment done using phonepe"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
