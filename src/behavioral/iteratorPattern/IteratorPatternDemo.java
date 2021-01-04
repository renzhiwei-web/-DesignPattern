package behavioral.iteratorPattern;

/**
 * 这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        Container container = new NameRepository();

        for(Iterator iter = container.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
