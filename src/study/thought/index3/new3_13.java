package study.thought.index3;
import static net.mindview.util.Print.*;

// 字符串操作符 + +=
public class new3_13 {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z";
        print(s + x + y + z);
        print(x + " " + s);
        s+= "(summed)=";
        print(s + (x + y + z));
        // 这里的 ""+ 会将int类型的数据转换为String
        print("" + x);
    }
}
