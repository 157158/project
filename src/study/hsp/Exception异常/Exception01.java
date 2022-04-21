package study.hsp.Exception异常;

public class Exception01 {
    public static void main(String[] args) {
       int a = 10;
       int b = 0;

        try {
            int s = a / b;
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
    }
}
