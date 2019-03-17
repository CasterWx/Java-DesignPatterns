package com.antz.Singleton.LazySingleton;

/**
 * @author CasterWx  AntzUhl
 * @site https://github.com/CasterWx
 * @company Henu
 * @create 2019-03-17-18:17
 */
public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new LazyThread());
        Thread t2 = new Thread(new LazyThread());
        t1.start();
        t2.start();
        System.out.println("Program end");
    }
}
