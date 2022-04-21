package study.hsp.task.task01;

//6.编程创建一个Cale计算类,在其中定义2个变量表示两个操作数,
// 定义四个方法实 现求和、差、乘、商(要求除数为0的话,要提示)并创建两个对象,分别测试 Homework06.java
public class Homework06 {
    public static void main(String[] args) {
        Cale cl = new Cale(10, 10);
        System.out.println("加" + cl.jia());
        System.out.println("减" + cl.jian());
        System.out.println("乘" + cl.cheng());
        cl.chu();
    }
}

class Cale{
   double a, b;

   public Cale (double a, double b) {
      this.a = a;
      this.b = b;
   }

   public double jia (){
      double sum  = a + b;

      return sum;
   }

   public double jian () {
       double cha =  a - b;
       return cha;
   }

   public double cheng () {
       double ji  =  a * b;

       return ji;
   }

   public void chu () {
       if (b == 0 ) {
           System.out.println("被除数不能为0, 返回-1");
       }
       else {
           double shang = a / b;
           System.out.println("除" + shang);
       }

   }


}
