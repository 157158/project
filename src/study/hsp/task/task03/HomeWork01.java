package study.hsp.task.task03;
/*
*
* 1.在Frock 类中声明私有的静态属性EcurrentNum [int类型]，初始值为10000，作为衣服出 厂的序列号起始值。
2.声明公有的静态方法getNextNum ,作为生成上衣唯一序列号的方法。每调用一次，将 currentNum 增加100，并作为返回值。
3.在TestFrock 类的main方法中，分两次调用getNextNum 方法，获取序列号并打印输出。
4.在Frock 类中声明serialNumber (序列号)属性，井提供对应的get方法；
5.在Frocke 类的构造器中，通过调用getNextNum 方法为Frock 对象获取唯一序列号，赋给 serialNumberh 属性。
6.在TestFrock 类的main方法中，分创建三个Frock:对象，并打印三个对象的序列号，验 证是否为按100递增。*/
public class HomeWork01 {
    public static void main(String[] args) {
//        System.out.println(Frock.getNextNum());
//        System.out.println(Frock.getNextNum());

        Frock[] frocks = {new Frock(), new Frock(), new Frock()};
        for (Frock frock : frocks) {
            System.out.println(frock.getSerialNumber());
        }

    }
}

class Frock {
    private static int currentNum = 10000;
    private int serialNumber;

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }


    public Frock() {
        serialNumber = getNextNum();
    }


}
