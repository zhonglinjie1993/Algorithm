package com.algorithm.chapter2;

import java.util.Arrays;

/**
 * 选择排序
 * 选择排序是一种简单直观的排序算法，无论什么数据进去都是 O(n²) 的时间复杂度。所以用到它的时候，数据规模越小越好。唯一的好处可能就是不占用额外的内存空间了吧。
 * 1. 算法步骤
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
 * 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 重复第二步，直到所有元素均排序完毕。
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 8, 22, 25, 82, 20, 63, 95, 88, 55};
        SelectionSort (arr);
        System.out.println (Arrays.toString (arr));


    }

    private static void SelectionSort(int[] arr) {
        // 总共要经过 N-1 轮比较
        for (int i = 0; i < arr.length - 1; i++) {
            // 假定第一个元素是最小的数
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                // 如果未排序的序列小于已排序的序列
                if (arr[j] < arr[min]) {
                    // 记录目前能找到的最小值元素的下标
                    min = j;
                }

            }
            // 将找到的最小值和i位置所在的值进行交换
            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }
    }
}
