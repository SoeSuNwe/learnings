package oop.decorator.shape;

public class DecoratorPatternDemo {

    public static void main(String[] arg){
        System.out.println("******************Decorator Pattern**************************** \n");
        MyProcess();
    }
    public static void MyProcess(){
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
