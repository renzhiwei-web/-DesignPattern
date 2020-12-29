package builder.singletonPattern;

/**
 * 采用双重锁机制，安全且在多线程的情况下能保持高性能
 */
public class DCLSingleton {
    private volatile static DCLSingleton instance;
    private DCLSingleton (){}
    public static DCLSingleton getSingleton() {
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                if (instance == null) {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("DCLSingleton");
    }
}
