package com.kuang.service;

import com.kuang.pojo.BookDetail;
import com.kuang.pojo.Books;

import java.util.List;

//BookService:底下需要去实现,调用dao层
public interface BookService {
    //增加一个Book
    int addBook(Books book);
    //根据id删除一个Book
    int deleteBookById(int id);
    //更新Book
    int updateBook(BookDetail bookDetail);
    //根据id查询,返回一个Book
    BookDetail queryBookById(int id);
    //查询全部Book,返回list集合
    List<BookDetail> queryAllBook();

    BookDetail queryBookByName(String bookName);
}