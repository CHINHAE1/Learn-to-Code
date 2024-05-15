package com.ts.mthis;

/**
 * @Author CHINHAE @Date 2024/5/15 16:11 @PackageName:com.ts.mthis @ClassName: Student @Description:
 * TODO @Version 1.0
 */
public class Student {
    String name;

    public void sayHello(String name) {
        System.out.println("Hello " + this.name);
        method();
    }

    public void method(){
        System.out.println("Hello World");
    }
}
