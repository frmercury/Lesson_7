package com.company.PCBuilder;

public class Netbook {

    public static void main(String[] args) {
        CompConfig netbook = new CompConfig("Core i3", 8, "Nvidia 230", 256);
        System.out.println(netbook.toString());
    }
}

