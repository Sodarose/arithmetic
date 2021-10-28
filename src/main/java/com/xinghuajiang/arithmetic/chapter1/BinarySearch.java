package com.xinghuajiang.arithmetic.chapter1;

/**
 * @Auther: kangkang
 * @Date: 2021/10/25 16:31
 * @Description: 二分查找算法
 */
public class BinarySearch {

    public static int searchCount = 0;

    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = search(data, 10, 0, data.length - 1);
        System.err.println(i == 0 ? "未找到该元素！" : "该元素位于位置:" + i);
        System.err.println("计算次数：" + searchCount);
    }

    public static int search(int[] data, int target, int left, int right) {
        // 计算次数
        searchCount++;
        // 具体算法
        int mid = (left + right) / 2;
        if (left > right) {
            return 0;
        }
        if (data[mid] == target) {
            return mid;
        } else if (data[mid] > target) {
            return search(data, target, left, mid - 1);
        } else {
            return search(data, target, mid + 1, right);
        }
    }
}
