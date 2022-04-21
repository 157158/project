package study.hsp.arr;

import java.util.Scanner;

import static net.mindview.util.Print.*;

public class P169ArrNew {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arrNew = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        for (int a : arrNew) {
            System.out.print(a + " " );
        }
        Scanner sc = new Scanner(System.in);
        int sysSc = sc.nextInt();
        arrNew[arrNew.length - 1] = sysSc;
        arr = arrNew;
        for (int a : arr) {
            print(a);
        }
    }
}
