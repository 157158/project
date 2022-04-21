package study.hsp.Exception异常;

public class Exception04 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } finally {
            System.out.println("finally执行");
        }

    }
}
