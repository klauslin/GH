package com.xinjiku.basic;

import java.sql.SQLOutput;

/*
* 1. 泛型类
* 2. 泛型方法
* 3. 泛型接口
* */
public class Generics<E> {  // E->Element未知的数据类型   (T -> Type)
    private E name;
    private String sex;
    private E hha;



    public static void main(String[] args) {
        Generics<Integer> generics = new Generics();
        generics.setName(1);
        generics.setSex("男");
        generics.setHha(3);

        generics.method(4,"d");
        generics.method("我是字符串", 5);
    }

    public <E> void method(E t, E t2){

        System.out.println(t2);
        System.out.println(t);
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public E getHha() {
        return hha;
    }

    public void setHha(E hha) {
        this.hha = hha;
    }


    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }


}
