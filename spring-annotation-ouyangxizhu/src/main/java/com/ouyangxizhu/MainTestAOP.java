package com.ouyangxizhu;

import com.ouyangxizhu.aop.MathCalculator;
import com.ouyangxizhu.config.MainConfigAOP;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTestAOP {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigAOP.class);
        MathCalculator mathCalculator = context.getBean(MathCalculator.class);
        mathCalculator.div(1, 1);

    }
}
