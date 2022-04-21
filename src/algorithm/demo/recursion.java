package algorithm.demo;

/**
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 */
public class recursion {
    public static final int MONTH = 15;

    /**
     * 本月的兔子数量就是上一月和上上月的兔子数之和
     */
    public static void main(String[] args) {
        int a =1;   //兔子上上月数量
        int b =1;   //兔子数量和
        int c=0;   //暂时存放和
        for (int i = 0; i <MONTH ; i++) {
            c = a+b;
            a = b;
            b = c;
            System.out.println("第"+i+"月时兔子数量是："+b);
        }
    }
}
