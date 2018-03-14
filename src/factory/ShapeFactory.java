package factory;

import factory.base.Shape;

/**
 * Created by wuhuannan on 18-3-14.
 */
public class ShapeFactory {

    /**
     * 一般使用
     * @param type
     * @return
     */
    public Shape getShape1(String type) {

        Shape shape = null;

        if (type == null || type.length() == 0) {
            return null;
        }

        if ("Circle".equalsIgnoreCase(type)) {
            shape = new Circle();
        } else if ("Rectangle".equalsIgnoreCase(type)) {
            shape = new Rectangle();
        } else if ("Square".equalsIgnoreCase(type)) {
            shape = new Square();
        }

        return shape;
    }

    /**
     * 使用反射机制可以解决每次增加一个产品时，都需要增加一个对象实现工厂的缺点
     * 在Demo中使用采用强制转换
     * @param clz
     * @return
     */
    public Object getShape2(Class<? extends Shape> clz) {
        Object obj = null;

        try {
            obj = Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return obj;
    }

    /**
     * 使用泛型，在Demo中省略类型强制转换，支持多态
     * @param clz
     * @param <T>
     * @return
     */
    public <T> T getShape3(Class<? extends T> clz) {
        T shape = null;
        try {
            shape = (T) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return shape;
    }

}
