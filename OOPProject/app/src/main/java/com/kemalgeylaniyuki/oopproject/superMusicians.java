package com.kemalgeylaniyuki.oopproject;

public class superMusicians extends musician { // extends musicians demek : musician sınıfınından kalıtım al (inheritance)

    public superMusicians(String name, String instrument, int age) {
        super(name, instrument, age);
    }

    public String sing (){
        return "Nothing Else Matters";
    }

}
