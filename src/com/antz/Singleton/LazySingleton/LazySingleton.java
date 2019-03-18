package com.antz.Singleton.LazySingleton;

/**
 * @author CasterWx  AntzUhl
 * @site https://github.com/CasterWx
 * @company Henu
 * @create 2019-03-17-18:14
 */
public class LazySingleton {
    private static volatile LazySingleton lazySingleton = null ;
    private LazySingleton(){
    }
    public synchronized static LazySingleton getInstance(){
        if (lazySingleton==null){
            lazySingleton = new LazySingleton() ;
        }
        return lazySingleton ;
    }

    public synchronized static LazySingleton getInstance2(){
        if (lazySingleton==null){
            synchronized (LazySingleton.class){
                if (lazySingleton==null){
                    lazySingleton = new LazySingleton() ;
                }
            }
        }
        return lazySingleton ;
    }
}
