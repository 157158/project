package study.Demo00;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CanteenNiuMa {

    static SimpleDateFormat df = new SimpleDateFormat("HH");
    static Scanner scan = new Scanner(System.in);
    static String data = df.format(new Date());
    static String[] zfood = new String[]{"面条", "包子", "饺子", "馅饼", "烧麦", "烧饼", "玉米", "馒头"};
    static double[] zprice = new double[]{7, 1.5, 3, 2, 1.5, 3, 4, 0.5};
    static String[] wfood = new String[]{"青椒炒肉", "红烧肉", "回锅肉", "爆炒牛腩", "红烧排骨", "庆不理包", "鱼香肉丝", "剁椒鱼头"};
    static double[] wprice = new double[]{14, 15, 14, 20, 22, 90, 14, 45};
    static String[] yfood = new String[]{"鲍鱼", "龙虾", "杨春湖大闸蟹", "凉拌狗肉", "生蚝", "墨鱼丸子", "红烧海豚", "爆炒颜庆", "螺丝烧铁轨"};
    static double[] yprice = new double[]{190, 89, 396, 97, 10, 50, 1000, 9999, 900};

    public static void main(String[] args) {
        zhuYe();
    }

    public static void zhuYe() {
        System.out.println("--------------欢迎来到牛马食堂-------------");
        System.out.println("------------以下是牛马食堂的菜单-----------");
        switch (data) {
            case "22":
            case "23":
            case "24":
            case "01":
            case "02":
            case "03":
            case "04":
            case "05":
                System.out.println("----牛马食堂处于休息时间请在6:00-22:00时间之间来----");
                break;
            case "06":
            case "07":
            case "08":
            case "09":
            case "10":
                System.out.println("-------现在是早餐时间，早餐菜品如下↓-------");
                System.out.println("-------早餐MENU-------");
                for (int i = 0; i < zfood.length; i++) {
                    System.out.println(zfood[i] + "\t$" + zprice[i]);
                }
                order1();
                break;
            case "11":
            case "12":
            case "13":
            case "14":
            case "15":
                System.out.println("-------现在是午餐时间，午餐菜品如下↓-------");
                System.out.println("-------中餐LUNCH-------");
                for (int i = 0; i < wfood.length; i++) {
                    System.out.println(wfood[i] + "\t\t$" + wprice[i]);
                }
                order2();
                break;
            case "16":
            case "17":
            case "18":
            case "19":
            case "20":
            case "21":
                System.out.println("-------现在是晚餐时间，晚餐菜品如下↓-------");
                System.out.println("-------晚餐MENU-------");
                for (int i = 0; i < yfood.length; i++) {
                    System.out.println(yfood[i] + "\t\t$" + yprice[i]);
                }
                order3();
                break;
        }


    }

    public static void order1() {
        System.out.println("-----------------");
        System.out.println("请输入你的要吃的食物名称：");
        String sr1 = scan.next();
        switch (sr1) {
            case "面条":
                sp1(0);
                break;
            case "包子":
                sp1(1);
                break;
            case "饺子":
                sp1(2);
                break;
            case "馅饼":
                sp1(3);
                break;
            case "烧麦":
                sp1(4);
                break;
            case "烧饼":
                sp1(5);
                break;
            case "玉米":
                sp1(6);
                break;
            case "馒头":
                sp1(7);
                break;
            default:
                System.out.println("输入有误！！！重新输入");
                order1();
        }
    }

    public static void order2() {
        System.out.println("-----------------");
        System.out.println("请输入你的要吃的食物名称：");
        String sr1 = scan.next();
        switch (sr1) {
            case "青椒炒肉":
                sp2(0);
                break;
            case "红烧肉":
                sp2(1);
                break;
            case "回锅肉":
                sp2(2);
                break;
            case "爆炒牛腩":
                sp2(3);
                break;
            case "红烧排骨":
                sp2(4);
                break;
            case "庆不理包":
                sp2(5);
                break;
            case "鱼香肉丝":
                sp2(6);
                break;
            case "剁椒鱼头":
                sp2(7);
                break;
            default:
                System.out.println("输入有误！！！重新输入");
                order2();
        }
    }

    public static void order3() {
        System.out.println("-----------------");
        System.out.println("请输入你的要吃的食物名称：");
        String sr1 = scan.next();
        switch (sr1) {
            case "鲍鱼":
                sp3(0);
                break;
            case "龙虾":
                sp3(1);
                break;
            case "杨春湖大闸蟹":
                sp3(2);
                break;
            case "凉拌狗肉":
                sp3(3);
                break;
            case "生蚝":
                sp3(4);
                break;
            case "墨鱼丸子":
                sp3(5);
                break;
            case "红烧海豚":
                sp3(6);
                break;
            case "爆炒颜庆":
                sp3(7);
                break;
            case "螺丝烧铁轨":
                sp3(8);
                break;
            default:
                System.out.println("输入有误！！！重新输入");
                order3();
        }
    }

    public static void sp1(int a) {
        System.out.println("你要购买的商品是" + zfood[a] + ",价格是" + zprice[a] + "元");
        System.out.println("请付款：");
        double jg1 = scan.nextDouble();
        double sum1 = 0;
        if (jg1 > zprice[a]) {
            System.out.println("您支付了" + jg1 + "元钱,找您" + (jg1 - zprice[a]) + "元;");
            System.out.println("购买成功！！！");
            zhuYe();
        } else if (jg1 < zprice[a]) {

            double sum = 0;
            double sum2 = 0;
            do {
                sum2 = sum + jg1;
                System.out.println("您支付了" + jg1 + "元，还需要支付" + (zprice[a] - sum2) + "元;");
                System.out.println("请继续支付：");
                double jg2 = scan.nextDouble();
                sum += jg2;
                sum1 = sum + jg1;
            } while (sum1 < zprice[a]);
            if (sum1 > zprice[0]) {
                System.out.println("找您" + (sum1 - zprice[a]) + "元;");
            }
            System.out.println("购买成功！！！");
            zhuYe();
        } else {
            System.out.println("支付成功！！！！！");
            zhuYe();
        }
    }

    public static void sp2(int a) {
        System.out.println("你要购买的商品是" + wfood[a] + ",价格是" + wprice[a] + "元");
        System.out.println("请付款：");
        double jg1 = scan.nextDouble();
        double sum1 = 0;
        if (jg1 > wprice[a]) {
            System.out.println("您支付了" + jg1 + "元钱,找您" + (jg1 - wprice[a]) + "元;");
            System.out.println("购买成功！！！");
            zhuYe();
        } else if (jg1 < wprice[a]) {

            double sum = 0;
            double sum2 = 0;
            do {
                sum2 = sum + jg1;
                System.out.println("您支付了" + jg1 + "元，还需要支付" + (wprice[a] - sum2) + "元;");
                System.out.println("请继续支付：");
                double jg2 = scan.nextDouble();
                sum += jg2;
                sum1 = sum + jg1;
            } while (sum1 < wprice[a]);
            if (sum1 > wprice[0]) {
                System.out.println("找您" + (sum1 - wprice[a]) + "元;");
            }
            System.out.println("购买成功！！！");
            zhuYe();
        } else {
            System.out.println("支付成功！！！！！");
            zhuYe();
        }
    }

    public static void sp3(int a) {
        System.out.println("你要购买的商品是" + yfood[a] + ",价格是" + yprice[a] + "元");
        System.out.println("请付款：");
        double jg1 = scan.nextDouble();

        if (jg1 > yprice[a]) {
            System.out.println("您支付了" + jg1 + "元钱,找您" + (jg1 - yprice[a]) + "元;");
            System.out.println("购买成功！！！");
            zhuYe();
        } else if (jg1 < yprice[a]) {

            double sum = 0;
            double sum1 = 0;
            double sum2 = 0;
            do {
                sum2 = sum + jg1;
                double jg2 = scan.nextDouble();
                System.out.println("还需要支付" + (yprice[a] - sum2) + "元;");
                System.out.println("请继续支付：");
                sum += jg2;
                sum1 = sum + jg1;
            } while (sum1 < yprice[a]);
            if (sum1 > yprice[0]) {
                System.out.println("找您" + (sum1 - yprice[a]) + "元;");
            }
            System.out.println("购买成功！！！");
            zhuYe();

        } else {
            System.out.println("支付成功！！！！！");
            zhuYe();
        }
    }

}
