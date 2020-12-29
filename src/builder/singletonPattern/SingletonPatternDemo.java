package builder.singletonPattern;

/**
 * 该类负责创建自己的对象，同时确保只有单个对象被创建。
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //饿汉式单例模式
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();
        //获取唯一可用的对象
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        //显示消息
        hungrySingleton.showMessage();
        //=======================================================
        //懒汉式，线程不安全
        LazyUnafeSingleton lazyUnafeSingleton = LazyUnafeSingleton.getInstance();
        lazyUnafeSingleton.showMessage();

        //=======================================================
        //懒汉式，线程安全
        LazySafeSingleton lazySafeSingleton = LazySafeSingleton.getInstance();
        lazySafeSingleton.showMessage();

        //=======================================================
        //DCL
        DCLSingleton dclSingleton = DCLSingleton.getSingleton();
        dclSingleton.showMessage();
    }
}
