package oop.color.composite;

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
