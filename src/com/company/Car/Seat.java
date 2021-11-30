package com.company.Car;

import com.company.Car.ClassCar;

public class Seat {

    public static void main(String[] args) {
        ClassCar seat = new ClassCar("Leon","white", 10000);
        seat.setModelYear(2013);
        seat.setBodyType("Hatchback");
        seat.setDoorsNumber(5);
        seat.setEngineType("petrol");
        seat.setGearBoxType("automatic");
        seat.setEngineVolume(1.2);

        System.out.println(seat.toString());
    }
}