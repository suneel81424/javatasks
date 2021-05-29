/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.test;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author suneelkumar.a
 */
public class MapTest {

    public static void main(String[] args) {
        Map<Bean, String> map = new HashMap<>();
        Bean bean = new Bean(1, "suneel");
        Bean bean2 = new Bean(1, "ravi");
        map.put(bean, "sai");
//        map.put(bean, null);
        map.put(bean2, null);
        System.out.println(map);
        System.out.println(Float.valueOf("1.1").hashCode());
    }

    static class Bean {

        private int id;
        private String name;

        public Bean(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        @Override
        public int hashCode() {
            System.out.println("hashcode");
            return 32 * id * (name != null ? name.hashCode() : 1); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean equals(Object obj) {
                        System.out.println("equlas");
            if(obj==null){
                return false;
            }
            if(obj instanceof Bean){
                Bean bean=(Bean)obj;
                if(bean.getId()==this.getId()&&bean.getName().equalsIgnoreCase(name)){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }

        @Override
        public String toString() {
            return "Bean{" + "id=" + id + ", name=" + name + '}';
        }

    }
}
