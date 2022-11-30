package com.cc.java;

public class Bird implements Flyable, IFeathers {

    @Override
    public String fly() {
        return "I'm a flying bird";
    }

    @Override
    public String hasFeathers() {
        return "I do";
    }


    
}
