package org.example.chap1.basic.progamming.model.binary.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveBinarySearchImplTest {

    @Test
    public void test_rankSearchTargetInEvenIndex_returnsIndexOfTarget() {
        int rank = RecursiveBinarySearchImpl.rankRecursive(new int[] {1, 2, 3, 4, 5, 6, 7}, 0, 6, 3);

        assertEquals(2, rank);
    }

    @Test
    public void test_rankSearchTargetInOddIndex_returnsIndexOfTarget() {
        int rank = RecursiveBinarySearchImpl.rankRecursive(new int[] {1, 2, 3, 4, 5, 6, 7}, 0, 6, 4);

        assertEquals(3, rank);
    }

    @Test
    public void test_rankSearchTargetNotPresentAndMoreThanMaxValueOfArr_NoResult() {
        int rank = RecursiveBinarySearchImpl.rankRecursive(new int[] {1, 2, 3, 4, 5, 6, 7}, 0, 6, 48);

        assertEquals(-1, rank);
    }

    @Test
    public void test_rankSearchTargetNotPresentAndLessThanMaxValueOfArr_NoResult() {
        int rank = RecursiveBinarySearchImpl.rankRecursive(new int[] {1, 2, 3, 4, 5, 6, 7}, 0, 6, -5);

        assertEquals(-1, rank);
    }

    @Test
    public void test_rankSearchTargetNotPresentAndBetweenTheMinAndMaxValueOfArr_NoResult() {
        int rank = RecursiveBinarySearchImpl.rankRecursive(new int[] {1, 4, 7, 8, 10, 14, 20}, 0, 6, 9);

        assertEquals(-1, rank);
    }

    @Test
    public void test_rankArrHasNonConitnuousNumsAndSearchTargetPresent_TargetIndexReturned() {
        int rank = RecursiveBinarySearchImpl.rankRecursive(new int[] {1, 4, 7, 8, 10, 14, 20}, 0, 6, 4);

        assertEquals(1, rank);
    }

    @Test
    public void test_rankArrHasNonConitnuousNumsAndSearchTargetPresentInStart_TargetIndexReturned() {
        int rank = RecursiveBinarySearchImpl.rankRecursive(new int[] {1, 4, 7, 8, 10, 14, 20}, 0, 6,1);

        assertEquals(0, rank);
    }

    @Test
    public void test_rankArrHasNonConitnuousNumsAndSearchTargetPresentInEnd_TargetIndexReturned() {
        int rank = RecursiveBinarySearchImpl.rankRecursive(new int[] {1, 4, 7, 8, 10, 14, 20}, 0, 6, 20);

        assertEquals(6, rank);
    }

    @Test
    public void test_rankEmptyArr_NoResult() {
        int rank = RecursiveBinarySearchImpl.rankRecursive(new int[] {}, 0, 0, 20);

        assertEquals(-1, rank);
    }

    @Test
    public void test_rankSingleElementArrayAndTargetNotPresent_NoResult() {
        int rank = RecursiveBinarySearchImpl.rankRecursive(new int[] {23}, 0, 0, 20);

        assertEquals(-1, rank);
    }

    @Test
    public void test_rankSingleElementArrayAndTargetPresent_IndexReturned() {
        int rank = RecursiveBinarySearchImpl.rankRecursive(new int[] {20}, 0, 0, 20);

        assertEquals(0, rank);
    }

    @Test
    public void test_rankNullArray_NoResult() {
        int rank = RecursiveBinarySearchImpl.rankRecursive(null, 0, 0,20);

        assertEquals(-1, rank);
    }

    @Test
    public void test_rankWrongIndexesSupplied_NoResult() {
        int rank = RecursiveBinarySearchImpl.rankRecursive(new int[] {1, 2, 3, 4, 5, 6, 7, 48}, 4, 3, 48);

        assertEquals(-1, rank);
    }

}