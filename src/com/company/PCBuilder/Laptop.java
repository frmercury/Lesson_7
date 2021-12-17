package com.company.PCBuilder;

public class Laptop {

    public static void main(String[] args) {
        CompConfig laptop = new CompConfig("Core i7", 16, "Nvidia 3070", 1000);
        System.out.println(laptop.toString());
    }
}
