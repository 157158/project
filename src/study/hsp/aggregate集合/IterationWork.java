package study.hsp.aggregate集合;

import java.util.ArrayList;
import java.util.List;

public class IterationWork {
    public static void main(String[] args) {
        ArrayList<Object> dogs = new ArrayList<>();
        dogs.add(new Dog("邓送喜"));
        dogs.add(new Dog("滕伟"));
        dogs.add(new Dog("马猴"));

        // 指定位置插入元素
        dogs.add(0, "tom");

        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("jack");
        // 指定位置插入插入集合
        dogs.addAll(4, arrayList);

        // get 获取指定元素
        System.out.println(dogs.get(4));

        //indexOf 返回参数首次出现的位置
        System.out.println(dogs.indexOf("jack"));
        //lastIndexOf 返回参数最后一次出现的位置
        System.out.println(dogs.lastIndexOf("tom"));

        //remove 删除指定位置的元素
        dogs.remove(4);

        //set 替换指定位置的元素
        dogs.set(0, "jack");

        //subList 返回从fromIndex到toIndex位置元素的子集合 注意是一个左闭右开区间
        List<Object> list =  dogs.subList(1, 4);
        System.out.println(list);


        System.out.println(dogs);
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
