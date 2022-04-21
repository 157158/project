package algorithm.sort;

/*
冒泡排序
*/
public class Bubbling {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 2, 7, 9, 6, 8};
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        for (int a :
                arr) {
            System.out.print(a + " ");
        }
    }
}
