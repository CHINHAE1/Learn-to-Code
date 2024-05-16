package com.ts.list;

import com.ts.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author CHINHAE @Date 2024/5/16 18:17 @PackageName:com.ts.list @ClassName:
 * ArrayListExec3 @Description: TODO @Version 1.0
 */

/*
需求：创建一个存储学生对象的集合，存储3个学生对象,
学生的姓名和年龄来自于键盘录入
使用程序实现在控制台遍历该集合
 */

public class ArrayListExec3 {
  public static void main(String[] args) {

    printStudent();

  }

  private static void printStudent() {
    ArrayList<Student> arr = new ArrayList<>();

    for(int i = 0; i < 3; i++) {
      addStudent(arr);
    }

    for (Student student : arr) {
      System.out.println("学生的姓名:" + student.getName());
      System.out.println("学生的年龄:" +student.getAge());
    }
  }

  private static void addStudent(ArrayList<Student> arr) {

    Scanner sc = new Scanner(System.in);
    System.out.println("欢迎进入学生录入系统");
    System.out.println("-----------------------");
    System.out.println("请输入学生的姓名");
    String name = sc.nextLine();
    System.out.println("请输入学生的年龄");
    int age = sc.nextInt();

    Student stu = new Student(name,age);

    arr.add(stu);

  }

}
