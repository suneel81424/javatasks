/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imi;

/**
 *
 * @author suneelkumar.a
 */
public class Tester {

    private String name;
    private String phno;
    private String teamName;

    public Tester() {
    }

    public Tester(String name, String phno, String teamName) {
        this.name = name;
        this.phno = phno;
        this.teamName = teamName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

}
