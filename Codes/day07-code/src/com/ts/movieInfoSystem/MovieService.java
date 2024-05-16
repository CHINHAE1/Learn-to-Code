package com.ts.movieInfoSystem;

import java.util.Scanner;

/**
 * @Author CHINHAE @Date 2024/5/15 17:16 @PackageName:com.ts.movieInfoSystem @ClassName:
 * main @Description: TODO @Version 1.0
 */
public class MovieService {
  private final Scanner sc = new Scanner(System.in);
  MovieInfo movieInfo;

  public MovieService(MovieInfo movieInfo) {
    this.movieInfo = movieInfo;
  }


  public void start() {
    while (true) {
      System.out.println("--------电影信息系统--------");
      System.out.println("请输入您的选择:");
      System.out.println("1.查询全部电影信息");
      System.out.println("2.根据id查询电影信息");
      System.out.println("3.退出");
      int choiceNum = sc.nextInt();
      sc.nextLine();

      switch (choiceNum) {
        case 1:
          System.out.println("全部电影信息");
          movieInfo.allMovie();
          break;
        case 2:
          System.out.println("根据id查询的电影信息");
          movieInfo.findIdMovie();
          break;
        case 3:
          System.out.println("感谢您使用我们的系统，再见！");
          return;
        default:
          System.out.println("无效的选项，请重新选择。");
      }
    }
  }



}
