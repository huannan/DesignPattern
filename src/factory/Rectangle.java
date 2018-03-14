package factory;

import factory.base.Shape;

/**
 * Created by wuhuannan on 18-3-14.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw a Rectangle");
    }
}
