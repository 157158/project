package study.hsp.abstractclass抽象类;

public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        BB bb = new BB();
        //动态绑定 aa的运行对象是AA job调用的是AA中的job
        aa.calculateTime();
        bb.calculateTime();
    }
}

abstract class Template {
    public abstract void job();

    //抽象类的模板 这是模板设计模式的重中之重
    //这里已经写好了计算逻辑 每一个子类都可以正常调用这个模板 节省重复代码
    public final void calculateTime() {
        long start = System.currentTimeMillis();
        //动态绑定 这个job会运行调用他的那个对象运行类型中的 job
        job();

        long end = System.currentTimeMillis();
        System.out.println("执行job时间" + (end - start));
    }
}

class AA extends Template {
    //此任务计算1-100的和
    @Override
    public void job() {
        long sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
    }
}

class BB extends Template {
    //计算1-8000的和
    @Override
    public void job() {
        long sum = 0;
        for (int i = 0; i < 8000; i++) {
            sum *= i;
        }
    }
}

