package com.calculator;

import java.lang.*;

class SimpleCalculator
{
    public int addAToB(int a, int b) {
        return a + b;
    }

    public int subtractAFromB(int a, int b) {
        return a - b;
    }
}


class NotSimpleCalculator
{
    public double addAToB(double a, double b) {
        return a + b;
    }

    public double subtractAFromB(double a, double b) {
        return a - b;
    }
}

class Application
{
    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int result = simpleCalculator.addAToB(50, 5);
        System.out.println("The result of addition is: " + result);

        result = simpleCalculator.subtractAFromB(50, 5);
        System.out.println("The result of subtraction is: " + result);

        NotSimpleCalculator notSimpleCalculator = new NotSimpleCalculator();
        double result2 = notSimpleCalculator.subtractAFromB(51.16,24.98);
        System.out.println("The result of substraction is: " + result2);
    }
}


