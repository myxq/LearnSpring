package com.chinasofti.model;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 李永庆
 * @since 2020/6/3
 */
public class CarStaticFactory {

    public static Map<String,Car> carMap = new HashMap<>();

    static {
        carMap.put("奔驰",new Car("奔驰",2500));
        carMap.put("宝马",new Car("宝马",3000));
        carMap.put("奥迪",new Car("奥迪",2800));
    }

    public static Car getCar(String name){
        return carMap.get(name);
    }
}
