package study.hsp.Exception异常;

public class Exception03 {
    public static void main(String[] args) {
        try {
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;
            Person person = new Person();
            person = null;
            System.out.println(person.getName());

        } catch (NullPointerException e) {
            System.out.println("空指针异常=" + e.getMessage());
        } catch (
                ArithmeticException e) {
            System.out.println("算术异常=" + e.getMessage());
        } catch (
                Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }
}

class Person {
    private String name = "j";

    public String getName() {
        return name;
    }
}
