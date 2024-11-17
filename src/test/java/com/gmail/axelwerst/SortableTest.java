package com.gmail.axelwerst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortableTest {
    // given
    int[] arr1 = {11, 12, 22, 25, 34, 64, 90}; // Already sorted
    int[] arr2 = {64, 34, 25, 12, 22, 11, 90}; // Unsorted

    @Test
    void bubbleSort() {
        //when
        Sortable.bubbleSort(arr2);
        //then
        int[] sortArr = {11, 12, 22, 25, 34, 64, 90};
        Assertions.assertArrayEquals(sortArr, arr2);
    }

    @Test
    void isSorted() {
        //when
        boolean sorted = Sortable.isSorted(arr1);
        //then
        Assertions.assertTrue(sorted);
    }
}