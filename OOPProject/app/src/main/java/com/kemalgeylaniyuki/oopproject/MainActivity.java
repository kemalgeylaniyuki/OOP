package com.kemalgeylaniyuki.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /*
       user myUser = new user(); // user sınıfında myUser objesi oluşturduk.
        myUser.name = "KEMAL";
        myUser.job = "Engineer";
        */

        user myUser = new user("KEMAL", "Engineer"); // constructor yapısı olduğu içiçn hepsini tek satırda yazabiliyoruz.
        System.out.println(myUser.name);
        System.out.println(myUser.information());
        // Constructor

        musician james = new musician("James", "Guitar", 50);
        /*
        james.age = 60;
        System.out.println(james.age);
        */

        // Encapculation

        System.out.println(james.getName()); // kapsüle ettiğimiz için getter kullandık
        james.setAge(60, "KEMAL"); // kapsüle ettiğimiz için setter kullandık. // değiştirmek için şifre ekledik.
        System.out.println(james.getAge());

        // Inheritance

        superMusicians lars = new superMusicians("Lars", "Drums", 55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        // Polymorphism

        // Static Polymorphism

        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(3, 5));
        System.out.println(mathematics.sum(3, 4, 5));

        // Dinamik Polymorphism

        Animals animals = new Animals();
        animals.sing();
        Dog barley = new Dog();
        barley.sing();
        barley.test();

        // Interface

        Piano piano = new Piano();
        piano.brand = "Yamaha";
        piano.digital = true;
        piano.info();





    }
}