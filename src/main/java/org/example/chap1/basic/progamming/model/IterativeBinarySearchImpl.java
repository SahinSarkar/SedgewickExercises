package org.example.chap1.basic.progamming.model;

public class IterativeBinarySearchImpl {

    public static void main(String[] args) {
        int[] sortedArr = {1,2,3,4,5,6,7};
        int target = 5;
        int indexOfElement = rank(sortedArr, target);
        System.out.println(indexOfElement);
    }

    public static int rank(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        } else {
            int i=0;
            int j = arr.length - 1;
            int mid;
            while (i <= j) {
                System.out.println("Array segment scanning start: " + i + " " + j);
                mid = (i + j) / 2;
                if (target < arr[mid]) {
                    j = mid - 1;
                } else if(target > arr[mid]) {
                    i = mid + 1;
                } else {
                    return mid;
                }
                System.out.println("Array segment scanning updated: " + i + " " + j);
                System.out.println();
            }
            return -1;
        }
    }
}
