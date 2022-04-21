package study.Demo01;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        da();
    }

    public static void da(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------万年历-------");

        System.out.print("请输入年份：");
        int year = scanner.nextInt();

        System.out.print("请输入月份：");
        int month = scanner.nextInt();

        int week = numberDays(year, month);
        System.out.println(week);
        System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期日");
        int sum = 0;
        switch (month) {
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    sum = 29;
                } else {
                    sum = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                sum = 30;
                break;
            default:
                sum = 31;
                break;
        }
        for (int i = 0; i < week - 1; i++) {
            System.out.print("\t\t");
        }
        int a = week - 1;
        for (int i = 1; i <= sum; i++) {

            System.out.print(i + "\t\t");
            if (i == 7 - a || i == 14 - a || i == 21 - a || i == 28 - a || i == 35 - a) {
                System.out.println();
            }

        }
    }
    public static int numberDays(int year, int month) {
        int da = 0;

        for (int i = 1900; i < year; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                da += 366;
            } else {
                da += 365;
            }
        }

        for (int i = 1; i < month; i++) {

            switch (i) {
                case 2:
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        da += 29;
                    } else {
                        da += 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    da += 30;
                    break;
                default:
                    da += 31;
                    break;
            }
        }

        System.out.println(da);
        da = (da % 7) + 1;
        return da;
    }
}

