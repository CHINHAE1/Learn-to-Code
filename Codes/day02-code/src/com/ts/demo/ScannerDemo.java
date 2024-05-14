package com.ts.demo;

import java.util.Scanner;

/**
 * @author CHINHAE
 */
public class ScannerDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入您的姓名: ");
    String name = sc.nextLine();
    System.out.println("请输入您的年龄: ");
    int age = sc.nextInt();
    sc.nextLine();
    System.out.println("请输入您的性别: ");
    String sex = sc.nextLine();
    System.out.println("请输入您的身高: ");
    int sg = sc.nextInt();
    System.out.println("请输入您的婚姻状况: ");
    boolean flag = sc.nextBoolean();
    // 换行符
    sc.nextLine();
    System.out.println("注册成功! ");
    System.out.println("输入的姓名是: " + name);
    System.out.println("输入的年龄是: " + age);
    System.out.println("输入的性别是: " + sex);
    System.out.println("输入的身高是: " + sg);
    System.out.println("您的婚姻状况是: " + flag);
  }
}
