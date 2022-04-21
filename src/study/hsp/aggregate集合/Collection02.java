package study.hsp.aggregate集合;

import java.util.ArrayList;
import java.util.List;

public class Collection02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println("=====添加元素=====");
        //add() 添加元素
        list.add("javaWeb");
        list.add(".net");
        list.add("html");
        list.add("xml");
        list.add("zookeeper");
        list.add("hadoop");
        System.out.println(list);
        System.out.println("=====删除元素=====");
        //remove() 删除元素 可根据下标和元素删除
        list.remove(4);
        list.remove("hadoop");
        System.out.println(list);
        System.out.println("=====获取长度=====");
        //size() 获取长度
        int len = list.size();
        System.out.println("list len = " + len);
        System.out.println("=====替换元素=====");
        //set() 替换元素
        list.set(0, "SprintBoot");
        System.out.println(list);
        System.out.println("=====查找元素=====");

        //get() 查找元素
        System.out.println(list.get(0));
        System.out.println("=====清空所有元素=====");
        //clear() 清空所有元素
        list.clear();
        System.out.println(list);
    }
}
