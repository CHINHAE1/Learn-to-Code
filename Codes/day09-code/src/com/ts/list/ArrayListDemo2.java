package com.ts.list;

import java.util.ArrayList;

/**
 * @Author CHINHAE @Date 2024/5/16 17:10 @PackageName:com.ts.list @ClassName:
 * ArrayListDemo2 @Description: TODO @Version 1.0
 */

/*
  ArryList 常用成员方法:

    1.增 :
              public boolean add(E e) : 将指定的元素追加到此列表的末尾。
              public void add(int index, E element) : 在此列表中的指定位置插入指定的元素。
    2.删
              public void clear() : 从列表中删除所有元素。
              public E remove(int index) 删除该列表中指定位置的元素,返回被删除掉的元素.
              public boolean remove(Object o) : 从列表中删除指定元素的第一个出现（如果存在）,返回删除是否成功
    3.改
              public E set(int index, E element) : 用指定的元素替换此列表中指定位置的元素,返回被覆盖掉的元素.
    4.查
              public E get(int index) : 返回此列表中指定位置的元素。
              public int size() : 返回此列表中的元素数。
              public boolean isEmpty() : 如果此列表不包含元素，则返回 true 。
*/
public class ArrayListDemo2 {
  public static void main(String[] args) {
    addMethod();
    removeMethod();
    updateMethod();
    inquireMethod();
  }

  private static void inquireMethod() {
    ArrayList<String> arrayList3 = new ArrayList<>();
    arrayList3.add("张三3");
    arrayList3.add("李四3");
    arrayList3.add("王五3");

    int size = arrayList3.size();
    System.out.println(size);
    String s = arrayList3.get(2);
    System.out.println(s);
  }

  private static void updateMethod() {
    ArrayList<String> arrayList2 = new ArrayList<>();
    arrayList2.add("张三2");
    arrayList2.add("李四2");
    arrayList2.add("王五2");

    arrayList2.set(1, "张三呀2");
    System.out.println(arrayList2);
  }

  private static void removeMethod() {
    ArrayList<String> arrayList1 = new ArrayList<>();
    arrayList1.add("张三1");
    arrayList1.add("李四1");
    arrayList1.add("王五1");
    // arrayList1.remove(2);

    arrayList1.remove("李四1");
    System.out.println(arrayList1);
  }

  private static void addMethod() {
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("张三");
    arrayList.add("李四");
    arrayList.add("王五");
    arrayList.add(2, "我还在");
    System.out.println(arrayList);
  }
}
