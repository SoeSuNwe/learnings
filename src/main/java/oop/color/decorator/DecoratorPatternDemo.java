package oop.color.decorator;

public class DecoratorPatternDemo {

    public void Process(){
        Shape circle =new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        Shape redCircle=new RedShapeDecorator(new Circle());
        System.out.println("\n Circle of red border");
        redCircle.draw();

        Shape redRectangle =new RedShapeDecorator(new Rectangle());
        System.out.println("\n Rectangle of red border");
        redRectangle.draw();

    }

}
