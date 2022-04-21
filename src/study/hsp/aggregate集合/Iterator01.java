package study.hsp.aggregate集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator01 {
    public static void main(String[] args) {
        Collection<Book> book = new ArrayList<>();
        book.add(new Book("Java编程思想", 100));
        book.add(new Book("Python学习手册", 70));
        book.add(new Book("鸟哥的Linux", 65));
        book.add(new Book("shell命令行编程", 76));

        // 创建一个迭代器
        Iterator<Book> iterator = book.iterator();
        // 每次使用迭代器之前都需要使用.hasNext() 判断是否还有下一个元素
        while (iterator.hasNext()) {
            // next() 取出元素
            Object obj = iterator.next();
            System.out.println("obj = " + obj);
        }
        //当迭代器已经遍历结束后 再次使用迭代器时 会报NoSuchElementException异常
        try {
            System.out.println(iterator.next());
        } catch (Exception e) {
            System.out.println("报异常" + e);
        }
        // 如果迭代结束后 希望再次遍历 必须重置迭代器
        iterator = book.iterator();
        System.out.println();
        System.out.println();
        // 增强for循环 代替迭代器
        for (Book bk : book) {
            System.out.println(bk);
        }

    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
