package oop.factory.calculator;

public class CalculatorFactory {
    public Calculate getCalculation(String type){
        Calculate obj =null;
        if(type.equalsIgnoreCase("add")){
            obj= new Add();
        }
        else if(type.equalsIgnoreCase("subtract")){
            obj= new Subtract();
        }
        else if(type.equalsIgnoreCase("divide")){
            obj= new Divide();
        }
        else if(type.equalsIgnoreCase("multiply")){
            obj= new Multiply();
        }
        return obj;
    }
}
