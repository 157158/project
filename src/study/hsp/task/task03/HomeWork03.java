package study.hsp.task.task03;

import java.util.Scanner;

/*
1.计算器接口具有work方法，功能是运算，有一个手机类Cellphone ,定义方法testWork  测试计算功能，调用计算接口的work方法，
2.要求调用CellPhone对象的testWork方法，使用上匿名内部类
*/
public class HomeWork03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("加法运算:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        CellPhone cellPhone = new CellPhone();
        cellPhone.testWork(new Calculator() {
            @Override
            public void work() {
                System.out.println(a + b);
            }
        });
        scanner.close();
    }
}

interface Calculator {
    void work();
}

class CellPhone implements Calculator {

    public CellPhone() {
    }

    public void testWork(Calculator calculator) {
        calculator.work();
    }


    @Override
    public void work() {
    }
}

