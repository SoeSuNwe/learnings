package org.example;

import oop.abstraction.*;
import oop.decorator.DecoratorPatternDemo;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws CoffeeException {

        System.out.println("Hello world!");
        Map<CoffeeSelection, CoffeeBean> beans = new HashMap<CoffeeSelection, CoffeeBean>();
        beans.put(CoffeeSelection.ESPRESSO,new CoffeeBean("my favorite espresso bean",1000));
        beans.put(CoffeeSelection.FILTER_COFFEE,new CoffeeBean("my favorite filter coffee bean",1000));

        CoffeeMachine machine=new CoffeeMachine(beans);

        Coffee espresso = machine.brewCoffee(CoffeeSelection.ESPRESSO);

        System.out.println("******************Decorator Pattern**************************** \n");
        DecoratorPatternDemo demo=new DecoratorPatternDemo();
        demo.Process();

    }
}