package com.kemalgeylaniyuki.oopproject;

import java.sql.SQLOutput;

public class Piano implements Instrument, HouseDecor {

    String brand;
    Boolean digital;

    @Override
    public void info() {
        System.out.println("Override Method");
    }
}
