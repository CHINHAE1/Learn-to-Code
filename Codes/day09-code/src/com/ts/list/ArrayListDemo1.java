package com.ts.list;

import java.util.ArrayList;

/**
 * @Author CHINHAE @Date 2024/5/16 16:55 @PackageName:com.ts.list @ClassName:
 * ArrayListDemo1 @Description: TODO @Version 1.0
 */

/*
ArrayList集合的使用：

        1.构造方法：

            pubLicArrayList（）：创建一个空的集合容器
 */

public class ArrayListDemo1 {
  public static void main(String[] args) {
    ArrayList<Double> arrayList = new ArrayList<>();
    arrayList.add(11.1);
    arrayList.add(22.2);
    arrayList.add(33.3);

    ArrayList<String> arrayList1 = new ArrayList<>();
    arrayList1.add("张三");
    arrayList1.add("李四");
    arrayList1.add("王五");

    System.out.println(arrayList);
    System.out.println(arrayList1);
  }
}
