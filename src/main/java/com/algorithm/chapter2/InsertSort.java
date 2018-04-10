package com.algorithm.chapter2;

import java.util.Arrays;

/**
 * ，
 * 因为只要打过扑克牌的人都应该能够秒懂。插入排序是一种最简单直观的排序算法，它的工作原理是通过构建有序序列，
 * 对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * 插入排序和冒泡排序一样，也有一种优化算法，叫做拆半插入。
 * 1. 算法步骤
 * 将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
 * 从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。
 * （如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
 * ②什么使用用插入排序  对于非随机数组时最有效,比如 插入数据到有序数组中
 *
 * ③性能  长度为N 平均需要N^2/4 比较 和 N^2/4 交换   最坏情况需要 N^2/2 次交换和比较   最好情况N-1 次比较和0次交换(数组是有序的数组)
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {1, 99, 12, 25, 36, 18, 220, 225, 872, 1120, 63, 95, 808, 55};

        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {

        // 从第二个数开始排序,假设第一个是有序的
        for (int i = 1; i < arr.length; i++) {
            // 记录要插入的数据
            // 从已经排序的序列最右边的开始比较，找到比其小的数
            int temp = arr[i];
            int j = i;
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            // 存在比其小的数，插入
            if (j != i) {
                arr[j] = temp;
            }

        }


    }
}
