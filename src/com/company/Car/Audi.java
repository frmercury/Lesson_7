package com.company.Car;

public class Audi {

    public static void main(String[] args) {
        ClassCar audi = new ClassCar("A6","black", 100000);
        audi.setModelYear(2019);
        audi.setBodyType("Sedan");
        audi.setDoorsNumber(5);
        audi.setEngineType("diesel");
        audi.setGearBoxType("automatic");
        audi.setEngineVolume(3.0);

        System.out.println(audi.toString());
    }
}

