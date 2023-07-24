package oop.abstraction;

import java.util.Map;

public class CoffeeMachine {
    private Map<CoffeeSelection, CoffeeBean> beans;

    public CoffeeMachine(Map<CoffeeSelection, CoffeeBean> beans) {
        this.beans = beans;

    }

    public Coffee brewCoffee(CoffeeSelection selection) throws CoffeeException {
        switch (selection) {
            case ESPRESSO -> {
                return espressoCoffee();
            }
            case FILTER_COFFEE -> {
                return brewFilterCoffee();
            }
            default -> throw new CoffeeException();
        }
    }

    private Coffee espressoCoffee() {
        Coffee coffee = new Coffee(CoffeeSelection.ESPRESSO, 20);
        System.out.println("I am espresso coffee");
        return coffee;

    }

    private Coffee brewFilterCoffee() {
        Coffee coffee = new Coffee(CoffeeSelection.FILTER_COFFEE, 20);
        System.out.println("I am filter coffee");
        return coffee;

    }
}
