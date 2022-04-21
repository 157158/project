package study.hsp.objectExplain;

public class HashCode {
    public static void main(String[] args) {
        a a = new a();
        a aa = new a();
        a a1 = a;

        System.out.println(a.hashCode());
        System.out.println(aa.hashCode());
        System.out.println(a1.hashCode());
    }
}

class a {

}
