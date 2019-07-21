package danli;
class Singleton {  
	//懒汉式  线程不安全
    private static Singleton instance;  
    private Singleton (){}  
  
    public static Singleton getInstance() {  
    if (instance == null) {  
        instance = new Singleton();  
    }  
    return instance;  
    }  
}  
class Singleton2 {  
	// 懒汉式  线程安全的 但是因为添加了synchronized 所以性能很差
    private static Singleton2 instance;  
    private Singleton2 (){}  
    public static synchronized Singleton2 getInstance() { 
    	//双重锁检验
    if (instance == null) {  
        instance = new Singleton2();  
    }  
    return instance;  
    }  
} 
class Singleton3 {  
	//饿汉式  线程安全，但是一开始就初始化对象所以可能会造成内存浪费
    private static Singleton3 instance = new Singleton3();  
    private Singleton3 (){}  
    public static Singleton3 getInstance() {  
    return instance;  
    }  
} 
class Singleton4 {  
    private static class SingletonHolder {  
    	//登记式 线程安全的
    private static final Singleton4 INSTANCE = new Singleton4();  
    }  
    private Singleton4 (){}  
    public static final Singleton4 getInstance() {  
    return SingletonHolder.INSTANCE;  
    }  
}  

enum Singleton5 {  
	//这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
	//是线程安全的 而且很简洁
    INSTANCE;  
    public void whateverMethod() {  
    }  
}  

public class DanlliType {
	//本实例所有代码来自 https://blog.csdn.net/yin767833376/article/details/54379345
}
