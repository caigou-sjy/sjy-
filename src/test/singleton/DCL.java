package test.singleton;

/**
 * @title: DCL双检锁/双重校验锁（DCL，即 double-checked locking）线程安全，效率高
 * 区别于懒汉的加锁
 * dcl只锁创建单例，不锁获取单例，如果已经创建好了则不会加锁
 * @@Description:
 * @Author sujiaying@xiaomi.com
 * @Date: 2021/7/29 12:53
 */

public class DCL {
    private volatile static DCL instance;
    private DCL(){}
    public static DCL getInstance(){
        if(instance==null){
            synchronized (DCL.class){
                if(instance==null){
                    instance = new DCL();
                }
            }
        }
        return instance;
    }
}
