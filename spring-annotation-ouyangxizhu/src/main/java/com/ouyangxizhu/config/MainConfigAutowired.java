package com.ouyangxizhu.config;

import com.ouyangxizhu.dao.BookDao;
import com.ouyangxizhu.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

//@ComponentScan({"com.ouyangxizhu.controller","com.ouyangxizhu.service","com.ouyangxizhu.dao"})
//@ComponentScan({"com.ouyangxizhu.controller","com.ouyangxizhu.service"})
public class MainConfigAutowired {
    @Bean
    public BookDao bookDao(){
        return new BookDao();
    }

    @Bean
    public BookService bookService(BookDao bookDao) {
        return new BookService(bookDao);
    }

}
