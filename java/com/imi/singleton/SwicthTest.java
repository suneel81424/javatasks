/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.singleton;

/**
 *
 * @author suneelkumar.a
 */
public class SwicthTest {

    public static void main(String[] args) {
        String s = "2";
        switch (s + "test") {
            case "2test":
                System.out.println("1 came");
                break;
            default:
                System.out.println("wrong");
        }
    }
}
