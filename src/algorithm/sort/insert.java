package algorithm.sort;

/*
插入排序
*/
public class insert {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 2, 7, 9, 6, 8};
        // 从1开始插入 下标为0的只有一个元素 默认时有序的
        for (int i = 1; i < arr.length; i++) {
            // 从未排序的数据最左侧找出最小的数 向左替换
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int tmp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = tmp;
                // '--'会把最小的数向左一直移动
                j--;
            }
        }
        for (int a :
                arr) {
            System.out.print(a + " ");
        }
    }
}
