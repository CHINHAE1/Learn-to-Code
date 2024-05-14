package com.ts.demo;

/**
 * @author Aim
 */
public class VariableDemo2 {
  /*
  变量的注意事项：
  1.变量名不允许重复定义
  2.一条语句，可以定义出多个变量，中间需要使用逗号分隔
   */
  public static void main(String[] args) {
    int salary = 12000;

    //  1.变量名不允许重复定义
    //  salary = 15000;
    System.out.println(salary);

    //  2.一条语句,可以定义出多个变量需要用逗号分隔
    int a = 10, b = 4, c = 21;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

    //  3.变量在使用之前，必须完成赋值
    //  int num; (错误示范)
    int num = 1;
    System.out.println(num);
  }
}
