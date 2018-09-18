package com.china.bobo.study.wifestudy.贰java基础学习.java集合学习.List相关;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName MySetTest
 * @Description 集合测试类
 * @Author yandongjun
 * @Date 2018/8/16 上午11:19
 * @Version 1.0
 **/
public class MySetTest {
    public static void main(String[] args) {
        Set<A> set = new HashSet<A>();

        for (int i = 0; i < 10; i++) {
            // A a = new A();
            // a.setName("liangxiaoxiao")
            A a = new A("lisngxiaoxiao");
            set.add(a);
        }

        A b = new A("yandongjun");
        set.add(b);
        System.out.print(set.size());
    }
}

class A {

    private String name;

    // 默认构造函数
    public A() {

    }

    public A(String name) {
        this.name = name;
    }

    // get set方法自己写
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // toString方法自己写
    @Override
    public String toString() {
        return "class A name is " + name;
    }

}
