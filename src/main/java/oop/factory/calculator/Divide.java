package oop.factory.calculator;

public class Divide implements Calculate{
    @Override
    public void calculate(double n1, double n2) {
        System.out.println("num1/num2" + " " + (n1 / n2));
    }
}
