package study.hsp.aggregate集合;

import java.util.Arrays;

public class Hashset {

    public static void main(String[] args) {
/*
给定两个大小分别为 m 和 n 的正序（从小到大）数组nums1 和nums2。请你找出并返回这两个正序数组的 中位数 。
算法的时间复杂度应该为 O(log (m+n)) 。

输入：nums1 = [1,3], nums2 = [2]
输出：2.00000
解释：合并数组 = [1,2,3] ，中位数 2
*/
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        Arr(nums1, nums2);
    }

    public static void Arr(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] num = new int[n + m];
        System.out.println(Arrays.toString(num));
    }
}

