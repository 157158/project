package study.hsp.Exception异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception06 {
    public static void main(String[] args) {
        f4();
        f1();
    }

    public static void f2() {
        System.out.println("默认抛出异常");
        int n1 = 10;
        int n2 = 0;
        int c = n1 / n2;
    }

    public static void f1() {
        try {
            f3();
        } catch (FileNotFoundException e) {
            System.out.println("处理f3异常");
        }
    }

    public static void f3() throws FileNotFoundException {
        FileInputStream aa = new FileInputStream("D://a.txt");
    }

    public static void f4() {
        try {
            f5();
        } catch (ArithmeticException e) {
            System.out.println("在f4中处理了f5抛出的异常");
        }
    }

    public static void f5() throws ArithmeticException {
        System.out.println("抛出f2抛给f5的异常");
        f2();
    }






    public void readFile () throws FileNotFoundException {
        FileInputStream aa = new FileInputStream("D://a.txt");
    }
}



