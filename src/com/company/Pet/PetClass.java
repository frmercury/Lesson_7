package com.company.Pet;

public class PetClass {

        String name;
        String breed;
        int age;
        String color;

        public PetClass(String name, String breed,
                        int age, String color)
        {
            this.name = name;
            this.breed = breed;
            this.age = age;
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public String getBreed() {
            return breed;
        }

        public int getAge() {
            return age;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString () {
            return ("Hi, my name is " + name +".\n My breed is " + breed + ", I am "
                    + age + " years old and my color is " + color);
        }
}

