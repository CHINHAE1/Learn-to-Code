package com.ts.oop;

/**
 * @Author CHINHAE @Date 2024/5/15 15:53 @PackageName:com.ts.oop @ClassName: BookTest @Description:
 * TODO @Version 1.0
 */
public class BookTest {
    public static void main(String[] args){

        Book book = new Book();
        book.id = 001;
        book.name = "三国";
        book.price = 88.88;
        book.bookShow();

        Book book1 = new Book();
        book1.id = 002;
        book1.name = "水浒";
        book1.price = 88.88;
        book1.bookShow();

        Book book2 = new Book();
        book2.id = 003;
        book2.name = "富婆通讯录";
        book2.price = 10000;
        book2.bookShow();
    }
}
