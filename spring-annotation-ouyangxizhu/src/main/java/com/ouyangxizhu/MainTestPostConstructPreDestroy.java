package com.ouyangxizhu;

import com.ouyangxizhu.config.MainConfigInitializingBeanDisposableBean;
import com.ouyangxizhu.config.MainConfigPostConstructPreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTestPostConstructPreDestroy {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigPostConstructPreDestroy.class);
        context.close();
    }
}
