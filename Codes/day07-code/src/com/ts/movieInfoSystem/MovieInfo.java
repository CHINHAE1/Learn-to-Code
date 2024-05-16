package com.ts.movieInfoSystem;

/**
 * @Author CHINHAE @Date 2024/5/15 17:16 @PackageName:com.ts.movieInfoSystem @ClassName:
 * movieInfo @Description: TODO @Version 1.0
 */
public class MovieInfo {
    Movie[] movies;

    public MovieInfo(Movie[] movies) {
        this.movies = movies;
    }

    //  查询全部电影信息
    public void allMovie() {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }


    public void findIdMovie() {
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


}
