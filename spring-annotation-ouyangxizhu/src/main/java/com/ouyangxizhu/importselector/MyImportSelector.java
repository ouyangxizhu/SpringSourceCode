package com.ouyangxizhu.importselector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    /**
     *
     * @param importingClassMetadata 当前标注@Import注解的类的所有信息
     * @return 要导入容器中的所有组件的全限定类名数组
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println("=======================");
        System.out.println(importingClassMetadata.getAnnotationTypes());
        System.out.println("=======================");
        return new String[]{"com.ouyangxizhu.bean.Shape", "com.ouyangxizhu.bean.Color"};
//        return null;
    }
}
