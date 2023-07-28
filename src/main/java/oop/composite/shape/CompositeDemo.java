package oop.composite.shape;
//1.Base Component => interface or an abstract class
//2.Leaf =>Defines the behaviour for the elements in the composition.
//3.Composite=>It consists of leaf elements and implements the operations in base component. //Node

public class CompositeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();

        Drawing drawing=new Drawing();
        drawing.add(circle);
        drawing.add(triangle);
        drawing.draw("Red");
        drawing.clear();
        drawing.add(circle);
        drawing.draw("Yellow");
        drawing.remove(circle);
    }
}
