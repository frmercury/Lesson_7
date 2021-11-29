package com.company;

public class Dog {

        String name;
        String breed;
        int age;
        String color;

        public Dog (String name, String breed,
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
            return ("Hi my name is " + this.getName()+ ".\n My breed is " + this.getBreed()+ ", I am "
                    + this.getAge()+ " year old and my color is" + this.getColor());
        }
}
