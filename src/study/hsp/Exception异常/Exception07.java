package study.hsp.Exception异常;

public class Exception07 {
    public static void main(String[] args) {
        int age = 20;

        try {
            ifAge(age);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void ifAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("age < 18");
        }
        System.out.println("范围正确");
    }
}

class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}
