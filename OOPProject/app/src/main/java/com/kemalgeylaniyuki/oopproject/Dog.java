package com.kemalgeylaniyuki.oopproject;

import android.os.ParcelUuid;

public class Dog extends Animals {

    public void test(){
        super.sing(); // super extend edilen sınıfa referans verir
    }

    public void sing(){
        System.out.println("dog class");
    }

}
