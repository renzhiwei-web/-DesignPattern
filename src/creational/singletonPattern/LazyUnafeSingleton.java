package creational.singletonPattern;

/**
 * 懒汉式单例模式，最大的问题就是线程不安全，所以严格意义上它并不算单例模式。
 */
public class LazyUnafeSingleton {
    private static LazyUnafeSingleton instance;
    private LazyUnafeSingleton(){}

    public static LazyUnafeSingleton getInstance() {
        if (instance == null){
            instance = new LazyUnafeSingleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("LazyUnafeSingleton");
    }
}
