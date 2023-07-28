package oop.color.decorator;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    //abstract class method
    public ShapeDecorator(Shape decoratedShape) {
        // This keyword refers to current object itself
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
