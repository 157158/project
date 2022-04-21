package study.thought.index3;
import static net.mindview.util.Print.*;
// 三元操作符(三元表达式)
/*
* 三元表达式极为紧凑 能让代码更加简练优雅 而ifElse则更易理解
* */
public class new3_12 {
    //三元表达式 测试
    static int ternary(int i ){
        return i < 10 ? i * 100 : i * 10;
    }
    // if……else 测试
    static int standardIfElse(int i ){
        if (i < 10) {
           return i * 100;
        }else {
            return i * 10;
        }
    }

    public static void main(String[] args) {
        print(standardIfElse(10));
    }
}
