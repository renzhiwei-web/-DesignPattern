package builder.singletonPattern;

/**
 * 懒汉式单例模式，使用线程锁，线程安全，但是由于使用线程同步锁，会影响性能
 */
public class LazySafeSingleton {
    private static LazySafeSingleton instance;

    private LazySafeSingleton(){}

    public static synchronized LazySafeSingleton getInstance(){
        if (instance == null){
            instance = new LazySafeSingleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("LazySafeSingleton");
    }
}
