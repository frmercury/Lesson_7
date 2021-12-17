package com.company.MathApp;

public class AppMath {

    public static void main(String[] args) {
        FractionNumbers math = new FractionNumbers();
        math.setFirstNumber(math.getScanner());
        math.setSecondNumber(math.getScanner());

        math.sumOfNumbers();
        math.minusOfNumbers();
        math.multiplyOfNumbers();
        math.divideOfNumbers();
        System.out.println(math.toString());
    }
}
