package study.hsp.task.task01;

/*
 * 2.编写类A02,定义方法find,实现查找某字符串数组中的元素查找,并返回索引 如果找不到,返回-1.Homeworko 2.java
 * */
public class Homework02 {
    public static void main(String[] args) {
        String[] str = {"a", "b", "c", "d", "e", "f", "g"};
        int index = find(str, "e");
        System.out.println("查找字符索引为：" + index);
    }

    static int find(String[] str, String letter) {
        for (int i = 0, j = str.length; i < str.length / 2; i++, j--) {
            if (letter.equals(str[j - 1])) {
                return j - 1;
            }
            if (letter.equals(str[i])) {
                return i;
            }
        }
        return -1;
    }
}
