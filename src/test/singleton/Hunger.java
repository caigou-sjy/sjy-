package test.singleton;

/**
 * @title: Hunger 饿汉式（线程安全）
 * @@Description:
 * @Author sujiaying
 * @Date: 2021/7/29 12:47
 */

public class Hunger {
    private static Hunger instance  = new Hunger();
    private Hunger(){}
    public static Hunger getInstance(){
        return instance;
    }
}
