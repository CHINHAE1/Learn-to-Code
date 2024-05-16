package com.ts.list;

import com.ts.domain.Student;
import java.util.ArrayList;

/**
 * @Author CHINHAE @Date 2024/5/16 下午5:57 @PackageName:com.ts.list @ClassName:
 * ArrayListExec2 @Description: TODO @Version 1.0
 */

/*
only4Print() :
    需求：创建一个存储字符串的集合，内部存储字符串元素
          钢门吹雪，西域狂鸭，张三，甄妮玛黛，李四
          使用程序实现在控制台遍历该集合，将4个字的人名，打印在控制台
*/

/*
studentPrint() :
需求：创建一个存储学生对象的集合，存储3个学生对象，
使用程序实现在控制台遍历该集合
在控制台，展示出年龄低于18岁的学生信息

 */
public class ArrayListExec2 {
  public static void main(String[] args) {

    only4Print();

    studentPrint();
  }

  private static void studentPrint() {
    Student stu1 = new Student("张三", 23);
    Student stu2 = new Student("李四", 21);
    Student stu3 = new Student("王五", 13);

    ArrayList<Student> arr1 = new ArrayList<>();
    arr1.add(stu1);
    arr1.add(stu2);
    arr1.add(stu3);

    /*for (Student stu : arr1) {
      System.out.println(stu.getName() + " " + stu.getAge());
    }*/
    for (int i = 0; i < arr1.size(); i++) {
      Student stu = arr1.get(i);
      if (stu.getAge() < 18) {
        System.out.println(stu.getName() + " " + stu.getAge());
      }
    }
  }

  private static void only4Print() {
    ArrayList<String> arr = new ArrayList<>();
    arr.add("钢门吹雪");
    arr.add("西域狂鸭");
    arr.add("张三");
    arr.add("甄妮玛黛");
    arr.add("李四");

    for (String s : arr) {
      if (s.length() == 4) {
        System.out.println(s);
      }
    }
  }
}
