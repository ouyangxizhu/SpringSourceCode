package com.ouyangxizhu;

import com.ouyangxizhu.config.MainConfigAutowiredQualifierPrimary;
import com.ouyangxizhu.config.MainConfigResourceInject;
import com.ouyangxizhu.service.BookService;
import com.ouyangxizhu.utils.PrintBeanDefinitionNamesUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTestResourceInject {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigResourceInject.class);
        System.out.println("================");
        BookService bookService = (BookService) context.getBean(BookService.class);
        System.out.println(bookService);
        PrintBeanDefinitionNamesUtils.printBeanNames(context);
    }
}
