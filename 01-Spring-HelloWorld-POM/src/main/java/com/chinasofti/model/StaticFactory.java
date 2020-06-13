package com.chinasofti.model;

/**
 * @author 李永庆
 * @since 2020/6/3
 */
public class StaticFactory {
    public static Product getProduct(){
        return new Product();
    }
}
