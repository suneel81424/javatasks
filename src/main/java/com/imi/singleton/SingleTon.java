/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.singleton;

import java.io.Serializable;

/**
 *
 * @author suneelkumar.a
 */
public class SingleTon implements Cloneable,NewInterface, Serializable {

    public static SingleTon getSingleTon() {
        return InnerTest.singleTon;
    }
    private String singletonData;

    public void setSingletonData(String singletonData) {
        this.singletonData = singletonData;
    }

    public String getSingletonData() {
        return singletonData;
    }

    protected Object readReslove() {
        return InnerTest.singleTon;
    }

    public SingleTon(String singletonData) {
        this.singletonData = singletonData;
    }

    public SingleTon() {
        System.out.println("SingleTon");
        if (InnerTest.singleTon != null) {
            throw new IllegalStateException("can't create using reflectiona api");
        }
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException(); //To change body of generated methods, choose Tools | Templates.
    }

    static class InnerTest {

        private String data;
        private static String staticData;

        static {
            System.out.println("InnerTest static");
        }

        public static String getStaticData() {
            return staticData;
        }

        public String getData() {
            return data;
        }

        public InnerTest() {
            System.out.println("InnerTest");
        }
        private static SingleTon singleTon = new SingleTon("SingleTon test");
    }
}
