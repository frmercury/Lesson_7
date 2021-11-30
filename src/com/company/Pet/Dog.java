package com.company.Pet;

import com.company.Pet.PetClass;

public class Dog {
    public static void main(String[] args) {

        PetClass myDog = new PetClass("Manu","chihuahua", 1, "black-white");
        System.out.println(myDog.toString());
    }
}