/**
 * 在java中，饿汉式单例模式要优于懒汉式单例模式。
 */
public class Singleton2{
    private static Singleton2 singleton2;

    private Singleton2(){
    }

    public static synchronized Singleton2 getInstance(){
        if(singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}