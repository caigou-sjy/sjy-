package test.singleton;

/**
 * @title: Lazy 懒汉（线程不安全）加锁后安全
 * @@Description:
 * @Author sujiaying@xiaomi.com
 * @Date: 2021/7/29 12:51
 */

public class Lazy {
    private static Lazy instance;
    private Lazy(){}
    public static synchronized Lazy getInstance(){
    //public static Lazy getInstance(){
        if(instance==null){
            instance = new Lazy();
        }
        return instance;
    }
}
