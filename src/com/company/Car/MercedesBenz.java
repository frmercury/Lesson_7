package com.company.Car;

public class MercedesBenz {
    public static void main(String[] args) {
        ClassCar mercedesBenz = new ClassCar("AMG E450","grey", 200000);
        mercedesBenz.setModelYear(2021);
        mercedesBenz.setBodyType("cabriolet");
        mercedesBenz.setDoorsNumber(2);
        mercedesBenz.setEngineType("petrol");
        mercedesBenz.setGearBoxType("automatic");
        mercedesBenz.setEngineVolume(3.2);

        System.out.println(mercedesBenz.toString());
    }
}
