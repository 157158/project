package study.hsp.objectExplain;

public class ToString {
    public static void main(String[] args) {
        aa aa = new aa();
        String str =  aa.toString();
        System.out.println(str);
        System.out.println(aa);
    }

}

class aa {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "aa{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
