package org.example.chap1.basic.progamming.model.binary.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IterativeBinarySearchImplTest {


    @Test
    public void test_rankSearchTargetInEvenIndex_returnsIndexOfTarget() {
        int rank = IterativeBinarySearchImpl.rank(new int[] {1, 2, 3, 4, 5, 6, 7}, 3);

        assertEquals(2, rank);
    }

    @Test
    public void test_rankSearchTargetInOddIndex_returnsIndexOfTarget() {
        int rank = IterativeBinarySearchImpl.rank(new int[] {1, 2, 3, 4, 5, 6, 7}, 4);

        assertEquals(3, rank);
    }

    @Test
    public void test_rankSearchTargetNotPresentAndMoreThanMaxValueOfArr_NoResult() {
        int rank = IterativeBinarySearchImpl.rank(new int[] {1, 2, 3, 4, 5, 6, 7}, 48);

        assertEquals(-1, rank);
    }

    @Test
    public void test_rankSearchTargetNotPresentAndLessThanMaxValueOfArr_NoResult() {
        int rank = IterativeBinarySearchImpl.rank(new int[] {1, 2, 3, 4, 5, 6, 7}, -5);

        assertEquals(-1, rank);
    }

    @Test
    public void test_rankSearchTargetNotPresentAndBetweenTheMinAndMaxValueOfArr_NoResult() {
        int rank = IterativeBinarySearchImpl.rank(new int[] {1, 4, 7, 8, 10, 14, 20}, 9);

        assertEquals(-1, rank);
    }

    @Test
    public void test_rankArrHasNonConitnuousNumsAndSearchTargetPresent_TargetIndexReturned() {
        int rank = IterativeBinarySearchImpl.rank(new int[] {1, 4, 7, 8, 10, 14, 20}, 4);

        assertEquals(1, rank);
    }

    @Test
    public void test_rankArrHasNonConitnuousNumsAndSearchTargetPresentInStart_TargetIndexReturned() {
        int rank = IterativeBinarySearchImpl.rank(new int[] {1, 4, 7, 8, 10, 14, 20}, 1);

        assertEquals(0, rank);
    }

    @Test
    public void test_rankArrHasNonConitnuousNumsAndSearchTargetPresentInEnd_TargetIndexReturned() {
        int rank = IterativeBinarySearchImpl.rank(new int[] {1, 4, 7, 8, 10, 14, 20}, 20);

        assertEquals(6, rank);
    }

    @Test
    public void test_rankEmptyArr_NoResult() {
        int rank = IterativeBinarySearchImpl.rank(new int[] {}, 20);

        assertEquals(-1, rank);
    }

    @Test
    public void test_rankSingleElementArrayAndTargetNotPresent_NoResult() {
        int rank = IterativeBinarySearchImpl.rank(new int[] {23}, 20);

        assertEquals(-1, rank);
    }

    @Test
    public void test_rankSingleElementArrayAndTargetPresent_IndexReturned() {
        int rank = IterativeBinarySearchImpl.rank(new int[] {20}, 20);

        assertEquals(0, rank);
    }

    @Test
    public void test_rankNullArray_NoResult() {
        int rank = IterativeBinarySearchImpl.rank(null, 20);

        assertEquals(-1, rank);
    }
}