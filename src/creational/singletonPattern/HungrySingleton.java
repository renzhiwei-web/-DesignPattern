package creational.singletonPattern;

/**
 * 饿汉式单例模式
 * 饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以是线程安全的，可以直接用于多线程而不会出现问题。
 *  类加载时就初始化，浪费内存
 **/
public class HungrySingleton {
    // 创建singleObject的一个对象
    private static HungrySingleton instance = new HungrySingleton();
    // 让构造函数为private，这样该类就不会被实例化
    private HungrySingleton(){}

    // 获取唯一可用的对象
    public static HungrySingleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("HungrySingleton");
    }
}
