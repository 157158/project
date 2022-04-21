package study.hsp.Exception异常;

import java.util.Scanner;

public class Exception05 {
    public static void main(String[] args) {
        int num = 0;

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                String input = scanner.next();
                num = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("重新输入");
            }
        }

        System.out.println(num);

    }

}
