package com.ouyangxizhu.dao;

import org.springframework.stereotype.Repository;

//名字默认是类名首字母小写
@Repository
public class BookDao {
    private int label = 1;

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "label=" + label +
                '}';
    }
}
