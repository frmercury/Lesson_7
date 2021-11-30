package com.company.MathApp;

import java.util.Scanner;

public class FractionNumbers {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void sumOfNumbers () {
        System.out.println("Разница чисел = " + (firstNumber + secondNumber)+ "\n");
    }

    public void minusOfNumbers () {
        System.out.println("Разница чисел = " + (firstNumber - secondNumber)+ "\n");
    }

    public void multiplyOfNumbers () {
        System.out.println("Умножение чисел = " + firstNumber * secondNumber + "\n");
    }

    public void divideOfNumbers () {
        if (secondNumber != 0){
            System.out.println("Деление чисел = " + firstNumber / secondNumber + "\n");
        } else {
            System.out.println("На ноль делить нельзя! \n");
        }
    }

    @Override
    public String toString () {
        return ("First number " + firstNumber + "\n" + "Second number " + secondNumber);
    }

    public int getScanner () {
        System.out.println("Введите значение: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
