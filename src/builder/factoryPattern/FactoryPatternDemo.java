package builder.factoryPattern;

/**
 * 工厂模式的作用是：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建工程延迟到子类进行
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // 获取Circle的对象，并调用它的draw方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        // 调用 Circle的draw方法
        shape1.draw();

        // 获取 Rectangle 的对象，并调用它的 draw方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        // 调用 Rectangle的draw方法
        shape2.draw();

        // 获取 Square 的对象，并调用它的 draw方法

        Shape shape3 = shapeFactory.getShape("SQUARE");

        shape3.draw();
    }
}
