package com.china.bobo.study.wifestudy.贰java基础学习.java集合学习.List相关;

/**
 * @ClassName MyList
 * @Description 111
 * @Author yandongjun
 * @Date 2018/8/8 下午1:55
 * @Version 1.0
 **/
public class MyList {
    private Object[] objects = null;

    public MyList() {
        objects = new Object[10000];
    }

    public MyList(Integer capacity) {
        objects = new Object[capacity];
    }

    public Object get(int index) {
        return objects[index];
    }

    public void set(int index, Object o) {
        objects[index] = o;
    }

    public void add(Object o) {
        
    }

    public boolean del(Integer index) {
        return false;
    }
}
