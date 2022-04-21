package study.hsp.objectExplain;

public class Finalize {

    public static void main(String[] args) {
        Cat aa = new Cat("aa");
        //制空aa 对象 此时它已被视为一个垃圾
        aa = null;
        //gc 调用垃圾回收器
        System.gc();
        // 调用垃圾回收是一个异步进行的，它会先输出字符"aa"
        System.out.println("aa");
    }
}

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    //重写父类的finalize方法
    @Override
    protected void finalize() throws Throwable {
        //你可以在这个方法里进行一些操作
        //例如:释放一些资源，结束一些连接
        System.out.println("使用了Finalize");
    }
}
