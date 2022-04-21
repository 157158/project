package study.hsp.Exception异常.work;


/*
编写应用程序.java ,接收命令行的两个参数（整数），计算两数相除。
b)计算两个数相除，要求使用方法cal(int n1,int n2)
c)对数据格式不正确(NumeratorException )、缺少命令行参数
(ArrangedOutBoundsException )、除0进行异常处理(ArithmeticException )
*/
public class HomeWork01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        try {
            tryHandle("10", "0");
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }

    public static void tryHandle(String a, String b) throws
            NumberFormatException,
            ArrayIndexOutOfBoundsException,
            ArithmeticException {

        int a1 = Integer.parseInt(a);
        int a2 = Integer.parseInt(b);
        int c = a1 / a2;

    }
}




