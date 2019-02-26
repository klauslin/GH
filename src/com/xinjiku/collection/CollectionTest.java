package com.xinjiku.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
* 单列集合顶层类【List】【Set】
*
* */
public class CollectionTest {
    /* java.util
     * 共性方法:
     * add
     * clear
     * remove
     * contains
     * isEmpty
     * size
     * toArray
     * */
    public static void main(String[] args) {
//        Collection<String> coll = new ArrayList<>();
        Collection<String> coll = new HashSet<>();

        System.out.println(coll.toString());
        coll.add("第一个");
        System.out.println(coll.toString());
        coll.add("第二个");
        System.out.println(coll.toString());
        coll.remove("第一个");
        System.out.println(coll.toString());
        // 删除重复元素
        coll.add("张三");
        coll.add("张三");
        coll.add("张三");
        coll.remove("张三");
        System.out.println(coll.toString());
        // 删除不存在的
        coll.remove("哈哈");
        System.out.println(coll.toString());

        System.out.println("---------------");
        System.out.println(coll.contains("张三"));
        System.out.println(coll.isEmpty());
        System.out.println(coll.size());

        System.out.println("-----------------");
        Object[] ob = coll.toArray();
        for (int i = 0; i < ob.length; i++) {
            System.out.print(ob[i] + ",");
        }

    }
}
