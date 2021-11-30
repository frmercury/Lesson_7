package com.company.Car;

import java.time.LocalDate;

public class ClassCar {

    private String model;
    private String modelYear;
    private String bodyType;
    private String doorsNumber;

    private String engineType;
    private String engineVolume;
    private String gearBoxType;

    private String color;
    private double price;

    public ClassCar(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String invalidValue() {
        return "Invalid value";
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setModelYear(int modelYear) {
        int current_Year = LocalDate.now().getYear();
        if (modelYear <= 2010 || modelYear > current_Year) {
            this.modelYear = invalidValue();
        } else {
            this.modelYear = String.valueOf(modelYear);
        }
    }

    public void setDoorsNumber(int doorsNumber) {
        if (doorsNumber < 2 || doorsNumber > 5) {
            this.doorsNumber = invalidValue();
        } else {
            this.doorsNumber = String.valueOf(doorsNumber);
        }
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume < 1 || engineVolume > 5) {
            this.engineVolume = invalidValue();
        } else {
            this.engineVolume = String.valueOf(engineVolume);
        }
    }

        public void setGearBoxType (String gearBoxType){
            this.gearBoxType = gearBoxType;
        }

        public String modelInfo () {
            return ("Vehicle model: " + model + "\n" + "Year of manufacture: " + modelYear + "\n" + "Type of vehicle body: " + bodyType + "\n" + "Doors: " + doorsNumber);
        }

        public String driveInfo() {
            return ("Type of engine: " + engineType + "\n" + "Volume of engine: " + engineVolume + "\n" + "Type of gearbox: " + gearBoxType);
        }

        public String toString () {
           return ("The price for a " + color + " " + model + " car with the selected parameters is: " + price + "\n" + modelInfo() + "\n" + driveInfo());
        }
}