package study.hsp.Interface接口;

public class InterfacePolyPass {
    public static void main(String[] args) {
         IG teacher = new Teacher();
         teacher.a();
    }
}

class IG {
    public void a() {
        System.out.println("IG");
    }

}

class Teacher extends IG {
    @Override
    public void a() {
        System.out.println("Teacher");
    }
}

class Dog extends IG {
    @Override
    public void a() {
        System.out.println("Dog");
    }
}
