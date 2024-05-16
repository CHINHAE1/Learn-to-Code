package com.ts.list;

import java.util.ArrayList;

/**
 * @Author CHINHAE @Date 2024/5/16 下午5:52 @PackageName:com.ts.list @ClassName:
 * ArrayListExec1 @Description: TODO @Version 1.0
 */
public class ArrayListExec1 {
  public static void main(String[] args) {

    ArrayList<String> arr = new ArrayList<>();
    arr.add("a");
    arr.add("b");
    arr.add("c");

   /*
   for (String arrs : arr) {
      System.out.println(arrs);
    }
    */

    for (int i = 0; i < arr.size(); i++) {
      String s = arr.get(i);
      System.out.println(s);
    }
  }
}
