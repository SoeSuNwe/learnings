package oop.factory.calculator;

import java.util.Scanner;
public class CalculateDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1");
        double num1 = scanner.nextDouble();

        System.out.println("Enter num2");
        double num2 = scanner.nextDouble();

        System.out.println("Enter calculation needed add, subtract, divide");
        CalculatorFactory factory = new CalculatorFactory();
        Calculate obj = factory.getCalculation(scanner.next());

        obj.calculate(num1,num2);
    }
}
