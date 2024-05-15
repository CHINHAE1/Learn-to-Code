package com.ts.oop;

/**
 * @Author CHINHAE @Date 2024/5/15 15:24 @PackageName:com.ts.oop @ClassName: PhoneTest @Description:
 * TODO @Version 1.0
 */
public class PhoneTest {
    public static void main(String[] args){
        Phone phone = new Phone();
        phone.brand = "小米";
        phone.color = "白色";
        phone.price = 4999;
        System.out.print(phone.brand + " ");
        System.out.print(phone.color + " ");
        System.out.println(phone.price + " ");
        phone.call("小李");
        phone.sendMessage();




        Phone phone1 = new Phone();
        phone1.brand = "华为";
        phone1.color = "黑色";
        phone1.price = 6999;
        System.out.print(phone1.brand + " ");
        System.out.print(phone1.color + " ");
        System.out.println(phone1.price + " ");
        phone1.call("小李");
        phone1.sendMessage();
    }
}
