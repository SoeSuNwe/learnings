package oop.color.composite;
//https://www.digitalocean.com/community/tutorials/composite-design-pattern-in-java
//Composite pattern base component defines the common methods for leaf and composites. We can create a
//class Shape with a method draw(String fillColor) to draw the shape with given color. Shape.java
public interface Shape {
    public  void draw(String fillColor);
}
