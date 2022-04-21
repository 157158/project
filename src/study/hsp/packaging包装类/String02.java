package study.hsp.packaging包装类;

import static net.mindview.util.Print.print;

public class String02 {
    public static void main(String[] args) {
        String str1 = "1234567899";
        StringBuffer str = new StringBuffer(str1);
        str.append("10");
        print(str);
        str.delete(9, 10);
        print(str);
        str.replace(9, 11, "10");
        print(str);
        for (int i = str.length(); i > 0; i -= 3) {
            str.insert(i, ",");
        }
        str.delete(str.length()-1, str.length());
        print(str);
    }
}
