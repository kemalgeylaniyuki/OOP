package com.kemalgeylaniyuki.oopproject;

public class musician {

    private String name;
    private String  instrument;
    private int age;

    public musician(String name, String instrument, int age){
        this.name = name;
        this.instrument = instrument;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getInstrument() {
        return instrument;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public void setAge(int age, String password) { // age kısmında değişiklik yapmak için şifre koymak.
        if (password.matches("KEMAL")){
            this.age = age;
        }

    }


}
