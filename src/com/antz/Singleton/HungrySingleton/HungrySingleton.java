package com.antz.Singleton.HungrySingleton;

import com.antz.Singleton.LazySingleton.LazySingleton;

/**
 * @author CasterWx  AntzUhl
 * @site https://github.com/CasterWx
 * @company Henu
 * @create 2019-03-18-13:13
 */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = null ;
    static {
        hungrySingleton = new HungrySingleton() ;
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton ;
    }
}
