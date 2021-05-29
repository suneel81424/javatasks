/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi.sorting;

/**
 *
 * @author suneelkumar.a
 */
public class User {

    private int id;
    private String name;
    private long salary;

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", salary=" + salary + '}';
    }
    

    public User(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

}
