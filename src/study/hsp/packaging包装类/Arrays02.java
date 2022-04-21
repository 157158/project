package study.hsp.packaging包装类;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {
        Book[] books = {
                new Book("金瓶梅", 56.4),
                new Book("红楼梦", 70.5),
                new Book("小王子", 66.5),
                new Book("java编程思想", 100.7),
                new Book("Python学习手册", 77.5),
                new Book("Linux入门到入土", 88.4),
                new Book("shell命令行编程", 95.5)
        };
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                return b2.getName().length() - b1.getName().length();
            }
        });
        for (Book book : books) {
            System.out.println(book.getName());
        }
    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        setName(name);
        setPrice(price);
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
}
