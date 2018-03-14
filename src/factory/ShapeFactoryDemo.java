package factory;

import factory.base.Shape;

/**
 * Created by wuhuannan on 18-3-14.
 */
public class ShapeFactoryDemo {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape1("Circle");
        shape1.draw();
        Shape shape2 = factory.getShape1("Rectangle");
        shape2.draw();
        Shape shape3 = factory.getShape1("Square");
        shape3.draw();

        System.out.println("----------");

        Shape shape4 = (Shape) factory.getShape2(Circle.class);
        shape4.draw();

        System.out.println("----------");

        Circle shape5 = factory.getShape3(Circle.class);
        shape5.draw();

    }

}
