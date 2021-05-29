/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.singleton;

import com.google.gson.Gson;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;

/**
 *
 * @author suneelkumar.a
 */
public class App {

    private static Gson gson = new Gson();

    public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
        NewInterface singleTon = SingleTon.getSingleTon();
        JSONObject jSONObject = new JSONObject(singleTon);
        System.out.println(singleTon.hashCode());
        System.out.println(jSONObject);
        System.out.println(gson.getAdapter(SingleTon.class).fromJson(jSONObject.toString()).hashCode());
    }

    static class Test {

        private static String staticData;

        public static String getStaticData() {
            return staticData;
        }

        {
            System.out.println("non static");
        }

        static {
            System.out.println("Test static block");
        }

        public Test() {
            System.out.println("app test");
        }

    }
}
