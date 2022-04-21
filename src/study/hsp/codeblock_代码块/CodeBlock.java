package study.hsp.codeblock_代码块;

public class CodeBlock {
    public static void main(String[] args) {
        new Movie("a");
        new Movie("b",100, "寄了");


    }

}

class Movie {
    private String name;
    private double price;
    private String dir;

    //代码块执行顺序优先与构造器， 即代码块会在构造器之前执行
    {
        System.out.println("开始调用代码块");
        System.out.println("============");
    }

    public Movie (String name) {
        System.out.println("MovieA 使用了");
       this.name = name;
    }

    public Movie(String name, double price, String dir) {
        System.out.println("MovieB 被使用了");
        this.name = name;
        this.price = price;
        this.dir = dir;
    }
}
