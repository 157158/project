package study.hsp.task.task01;

import static net.mindview.util.Print.*;

//4.编写类A03,实现数组的复制功能copyArr,,输入旧数组,返回一个新数组,元素和 旧数组一样Homework04.java
public class Homework04 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 6, 7, 8, 9};
        for (int i : copyArr(arr)) {
            printnb(i + " ");
        }
    }

    static int[] copyArr(int[] arr) {
        int[] arrCp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arrCp[i]  = arr[i];
        }

        return arrCp;
    }
}
