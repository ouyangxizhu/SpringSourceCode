package com.ouyangxizhu;

import com.ouyangxizhu.tx.TxConfig;
import com.ouyangxizhu.tx.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTestTx {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.insertUser();
    }
}
