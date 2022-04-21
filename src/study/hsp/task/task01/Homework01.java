package study.hsp.task.task01;

/*
 *  1.编写类A01,定义方法max,实现求某个double 数组的最大值,并返回 Homework01.java
 * */
public class Homework01 {
    public static void main(String[] args) {
        double[] dou = {0.1, 1.8, 45.5, 43.3, 265.4, 1233.1, 78.1};
        System.out.println(max(dou));
        System.out.println(num);
        System.out.println(dou.length / 2);
    }

    static int num = 0;

    // 二分法查找
    static double max(double[] dou) {
        double max = 0;
        double min = 0;
        for (int i = 0, j = dou.length; i < (dou.length / 2); i++, j--) {
            if (max < dou[j - 1]) {
                max = dou[j - 1];
            }
            if (min < dou[i]) {
                min = dou[i];
            }
            num++;
        }
        double result;
        return result = Math.max(max, min);

    }
}
