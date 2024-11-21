package com.gmail.axelwerst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarFindbleTest {
    //given
    int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int n = arr.length;
    int x = 3;

    @Test
    void binarFindble() {
        //when
        BinarFindble ob = new BinarFindble();
        int[] arrSort = Sortable.bubbleSort(arr);
        int result = ob.BinarFindble(arrSort, 0, n - 1, x);

        Assertions.assertEquals(result, 2);

    }
}