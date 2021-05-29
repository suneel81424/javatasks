/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.spring;

import org.springframework.stereotype.Component;

/**
 *
 * @author suneelkumar.a
 */
@Component

public class Paytm implements Payment {

    @Override
    public String process() {
        return "Payment done using paytm";//To change body of generated methods, choose Tools | Templates.
    }

    public Paytm() {
        System.out.println("paytm");
    }

}
