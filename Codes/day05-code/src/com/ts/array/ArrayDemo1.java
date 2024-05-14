package com.ts.array;

/**
 * @Author CHINHAE @Date 2024/5/14 19:03 @PackageName:com.ts.array @ClassName:
 * ArrayDemo1 @Description: TODO @Version 1.0
 */
public class ArrayDemo1 {
  public static void main(String[] args) {
    int[][] arr = {
            {20, 23, 23},
            {43, 56, 23},
            {45, 76, 12}
    };
    printArray(arr);
    int sum = getSum(arr);
    System.out.println(sum);
  }

  public static void printArray(int[][] arr) {
    /*for (int i = 0; i < arr.length; i++) {
    // arr[i] : 每一个一维数组
      for (int j = 0; j < arr[i].length; j++) {
      //  继续遍历一维数组,获取内部的元素 arr[i][j] : 是一维数组的每一个值
        System.out.print(arr[i][j] + " ");
      }
    }*/

    for (int i = 0; i < arr.length; i++) {
      // arr[i] : 每一个一维数组
      int[] temp = arr[i];
      //  继续遍历一维数组,获取内部的元素
      for (int j = 0; j < temp.length; j++) {
        System.out.print(temp[j] + " ");
      }
    }
  }

  public static int getSum(int[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      // arr[i] : 每一个一维数组
      int[] temp = arr[i];
      //  继续遍历一维数组,获取内部的元素
      for (int j = 0; j < temp.length; j++) {
        sum += temp[j];
      }
    }
    return sum;
  }
}
