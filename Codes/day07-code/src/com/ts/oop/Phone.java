package com.ts.oop;

/**
 * @Author CHINHAE @Date 2024/5/15 15:22 @PackageName:com.ts.oop @ClassName: Phone @Description:
 * TODO @Version 1.0
 */
public class Phone {
    String brand;
    String color;
    int price;

    public void call(String name){
    System.out.println("给" + name + "打电话");
    }

    public void sendMessage(){
    System.out.println("群发消息");
    }
}
