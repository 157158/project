package study.hsp.task.task01;

//3.编写类Book,定义方法updatePrice ,实现更改某本书的价格,具体:如果价格 >150,则更改为150,
// 如果价格>100,更改为100,否则不变Homeworko 3.java
public class Homework03 {
    public static void main(String[] args) {
        Book book = new Book("java编程思想", 150);
        book.into();
        book.updatePrice();
        book.into();
    }
}

class Book {
    double price;
    String name;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void updatePrice() {
        if (price > 150) {
            price = 150;
        }
        if (price > 100) {
            price = 100;
        }

    }

    public void into (){
        System.out.println("名字 " + name + " 价格 " + price);
    }
}
