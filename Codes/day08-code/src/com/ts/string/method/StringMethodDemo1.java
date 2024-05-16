package com.ts.string.method;

/**
 * @Author CHINHAE @Date 2024/5/16 10:47 @PackageName:com.ts.string.method @ClassName:
 * StringMethodDemo1 @Description: TODO @Version 1.0
 */
public class StringMethodDemo1 {
  /*
  String类中用于比较的方法:

  boolean equals(Object anObject)
    将此字符串与指定对象进行比较。
  */
  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = new String("abc");
    System.out.println(s1 == s2);  // false
    System.out.println(s1.equals(s2));

  }
}
