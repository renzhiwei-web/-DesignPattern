package behavioral.visitorPattern;

/**
 * 我们使用了一个访问者类，它改变了元素类的执行算法。
 * 通过这种方式，元素的执行算法可以随着访问者改变而改变。
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
