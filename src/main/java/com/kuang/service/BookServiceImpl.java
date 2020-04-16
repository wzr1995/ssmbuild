package com.kuang.service;

import com.kuang.dao.BookMapper;
import com.kuang.pojo.BookDetail;
import com.kuang.pojo.Books;
import java.util.List;

public class BookServiceImpl implements BookService {

    //调用dao层的操作，设置一个set接口，方便Spring管理
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(BookDetail bookDetail) {
        return bookMapper.updateBook(bookDetail);
    }

    public BookDetail queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<BookDetail> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public BookDetail queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}