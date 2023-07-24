package oop.abstraction;

public class CoffeeBean {
    private String name;
    private double quantity;

    public CoffeeBean(String name, double quantity) {
        this.name = name;
        this.quantity =quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
