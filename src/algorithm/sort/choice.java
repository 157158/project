package algorithm.sort;

/*
选择排序: 取出数据中的极值作为首元素 直到排序完成

 */
public class choice {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 2, 4, 1, 9, 7, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            // 定义一个变量 用来获取最小值的下标
            // 这里用了最小值来演示 也可以使用最大值表示 但后续判断时将 '<' 改为 '>'
            int min = i;
            // 循环无序的数据 如遇到比首个数据小的数据 便进行下标的替换 直到找出最小数据的下标
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // 如最小值的下标进行替换 则对其中的数据进行替换
            if (min != i) {
                int tmp = arr[min];
                arr[min] = arr[i];
                arr[i] = tmp;
            }
        }
        // foreach打印查看结果
        for (int a :
                arr) {
            System.out.print(a + " ");
        }
    }
}
