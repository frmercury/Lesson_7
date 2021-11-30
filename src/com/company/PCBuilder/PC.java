package com.company.PCBuilder;

public class PC {
    public static void main(String[] args) {
        CompConfig pc = new CompConfig("Core i9", 32, "Nvidia 3090", 2000);
        System.out.println(pc.toString());
    }
}
