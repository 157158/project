package study.hsp.Exception异常;

public class Exception02 {
    public static void main(String[] args) {
        try {
            String str = "Exception";
            int a = Integer.parseInt(str);
            System.out.println("a = " + a);
        } catch (NumberFormatException e) {
            System.out.println("e =" + e);
        } finally {
            System.out.println("finally");
        }

        System.out.println("Exception");


    }
}
