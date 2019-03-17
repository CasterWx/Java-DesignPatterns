package com.antz.Singleton.LazySingleton;

/**
 * @author CasterWx  AntzUhl
 * @site https://github.com/CasterWx
 * @company Henu
 * @create 2019-03-17-18:17
 */
public class LazyThread implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance() ;
        System.out.println(Thread.currentThread().getName()+"   "+lazySingleton);
    }
}

