package org.example.chap1.basic.progamming.model.binary.search;

public class RecursiveBinarySearchImpl {

    public static void main(String[] args) {
        int[] sortedArr = {1,2,3,4,5,6,7};
        int target = 1;
        int indexOfElement = rankRecursive(sortedArr, 0, sortedArr.length - 1, target);
        System.out.println(indexOfElement);
    }

    public static int rankRecursive(int[] arr, int startIdx, int endIdx, int target) {

        if(arr == null || arr.length == 0 || startIdx > endIdx) {
            return -1;
        } else {
            while(startIdx <= endIdx) {
                int mid = (startIdx + endIdx) / 2;
                if(arr[mid] == target) {
                    return mid;
                } else if (target < arr[mid]) {
                    return rankRecursive(arr, startIdx, mid - 1, target);
                } else if (target > arr[mid]) {
                    return rankRecursive(arr, mid + 1, endIdx, target);
                }
            }
            return -1;
        }
    }
}
