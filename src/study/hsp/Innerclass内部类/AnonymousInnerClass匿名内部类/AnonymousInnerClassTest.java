package study.hsp.Innerclass内部类.AnonymousInnerClass匿名内部类;

public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        new AnonymousInnerClassTest().m();
    }

    private String name;

    public void m() {
        Cellphone cellphone = Cellphone.getInstance();
        cellphone.setName("分手快乐");
        name = cellphone.getName();
        cellphone.alarmClock(new Bell() {
            String name = "听书人";
            @Override
            public void ring() {
                System.out.println("播放起床闹钟:" + AnonymousInnerClassTest.this.name);
            }
        });
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("闹钟2：" + name);
            }
        });
    }
}
/*1.有一个铃声接口Bell,里面有个ring方法。 (右图)
2.有一个手机类Cellphone ,具有闹钟功能 alarmClock ,参数是Bell类型（右图）
3.测试手机类的闹钟功能，通过匿名内部类（对 象作为参数，打印：懒猪起床了
4.再传入另一个匿名内部类（对象），打印： 小伙伴上课了
匿名内部(1)继承(2)多态(3)动态绑定(4)内部类*/

interface Bell {
    //响铃
    void ring();
}

class Cellphone {
    private String name;

    private Cellphone() {
    }

    private static final Cellphone cellphone = new Cellphone();

    public static Cellphone getInstance() {
        return cellphone;
    }

    public void alarmClock(Bell bell) {
        bell.ring();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

