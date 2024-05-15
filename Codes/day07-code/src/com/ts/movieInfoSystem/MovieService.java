package com.ts.movieInfoSystem;

import java.util.Scanner;

/**
 * @Author CHINHAE @Date 2024/5/15 17:16 @PackageName:com.ts.movieInfoSystem @ClassName:
 * main @Description: TODO @Version 1.0
 */
public class MovieService {
  private Scanner sc = new Scanner(System.in);
  private Movie[] movies;

  public MovieService(Movie[] movies) {
    this.movies = movies;
  }

  public void start() {

    boolean choice = true;
    MovieInfo movieInfo = new MovieInfo();

    while (choice) {
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
          allMovie();
          break;
        case 2:
          System.out.println("根据id查询的电影信息");
          findIdMovie();
          break;
        case 3:
          System.out.println("感谢您使用我们的系统，再见！");
          choice = false;
          break;
        default:
          System.out.println("无效的选项，请重新选择。");
      }
    }
  }

  private void findIdMovie() {
    System.out.println("请输入电影编号:");
    int movieId = sc.nextInt();
    for (Movie movie : movies) {
      if (movie.getId() == movieId ){
        System.out.println("编号为:" + movieId + "的电影信息为:");
        System.out.println(movie);
        return;
      }
    }
      System.out.println("输入有误,查询不到此编号的电影");
  }

  //  查询全部电影信息
  private void allMovie() {
    for (Movie movie : movies) {
      System.out.println(movie);
    }
  }
}
