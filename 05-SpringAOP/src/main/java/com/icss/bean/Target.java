package com.icss.bean;

import org.springframework.stereotype.Component;

/**
 * @author 李永庆
 * @since 2020/6/5
 */
@Component
public class Target {
    public String save(String name) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Target.save()执行");
        return "success";
    }

    public void calc(){
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"X"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
