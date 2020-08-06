package com.ouyangxizhu.service;

import com.ouyangxizhu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

@Service
public class BookService {
//    @Qualifier("bookDao")
//    @Autowired(required = false)
//    @Resource
//    @Inject
    private BookDao bookDao;

//    @Autowired
    public BookService(BookDao bookDao) {
        System.out.println("bookService.......有参构造器");
        this.bookDao = bookDao;
    }

    public BookDao getBookDao() {
        return bookDao;
    }

//    @Autowired
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
