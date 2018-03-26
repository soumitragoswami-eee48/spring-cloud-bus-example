/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloud.bus.example.cloudbusdemo.model;

public class Singleton {
// static variable single_instance of type Singleton

    private static Singleton single_instance = null;

    public void setS(String s) {
        this.s = s;
    }

// variable of type String
    public String s;
//private constructor restricted to this class itself

    private Singleton() {
        s = "Hello I am a string from a Singleton class";
    }

// static method to create instance of Singleton class
    public static Singleton getInstance() {
        if (single_instance == null) {
            single_instance = new Singleton();
        }

        return single_instance;
    }
}
