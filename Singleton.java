//在内存中只有一个对象，节省内存空间
public class Singleton{
    private static Singleton singleton = new Singleton();

    private Singleton(){
    }

    public static Singleton getInstance(){
        return singleton;
    }

}