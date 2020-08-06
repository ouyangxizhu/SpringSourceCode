package com.ouyangxizhu;

import com.ouyangxizhu.config.MainConfigAutowired;
import com.ouyangxizhu.config.MainConfigAutowiredQualifierPrimary;
import com.ouyangxizhu.dao.BookDao;
import com.ouyangxizhu.service.BookService;
import com.ouyangxizhu.utils.PrintBeanDefinitionNamesUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTestAutowired {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigAutowired.class);
        System.out.println("================");
        BookService bookService = (BookService) context.getBean(BookService.class);
        System.out.println(context.getBean(BookDao.class) == bookService.getBookDao());

    }
}
