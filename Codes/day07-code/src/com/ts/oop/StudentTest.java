package com.ts.oop;

/**
 * @Author CHINHAE @Date 2024/5/15 15:11 @PackageName:com.ts.oop @ClassName:
 * StudentTest @Description: TODO @Version 1.0
 */
public class StudentTest {

  public static void main(String[] args) {
    Student s1 = new Student();
    System.out.println(s1.name);
    System.out.println(s1.age);
    s1.study();
    s1.eat();
  }
}
