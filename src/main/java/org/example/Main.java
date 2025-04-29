package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 2, 1, 4};
        bubbleSort(nums, true); // 1,1,2,3,4,5

        System.out.println(Arrays.toString(nums));
    }
    
    public static void bubbleSort(int[] nums) {
        bubbleSort(nums, true);
    }

    public static void bubbleSort(int[] nums, boolean ascending) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++){
                boolean condition = ascending
                        ? nums[j] > nums[j + 1]
                        : nums[j] < nums[j + 1];
                if (condition) {
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                }
            }
        }
    }
    /*
    315214
    1 35214
    11 5234
    112 534
    1123 54
    11234 5
     */
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIdx = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
        }
    }
    /*
    3     15214
    1     35214
    13    5214
    123   514
    1123  54
    11234 5
     */
    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
                nums[j + 1] = key;
            }
        }
    }
}
