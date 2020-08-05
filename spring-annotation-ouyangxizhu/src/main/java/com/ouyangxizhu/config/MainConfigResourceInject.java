package com.ouyangxizhu.config;

import com.ouyangxizhu.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

//@ComponentScan({"com.ouyangxizhu.controller","com.ouyangxizhu.service"})
@ComponentScan({"com.ouyangxizhu.controller","com.ouyangxizhu.service","com.ouyangxizhu.dao"})
public class MainConfigResourceInject {
    //这里用bean属性定义id为bookDao2和将方法改成bookDao2效果一样
    @Primary
    @Bean("bookDao2")
    public BookDao bookDao(){
        BookDao bookDao = new BookDao();
        bookDao.setLabel(2);
        return bookDao;
    }

}
