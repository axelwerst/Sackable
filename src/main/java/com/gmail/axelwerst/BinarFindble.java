package com.gmail.axelwerst;

public class BinarFindble {
    int BinarFindble(int arr[], int low, int high, int x) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return BinarFindble(arr, low, mid - 1, x);
            return BinarFindble(arr, mid + 1, high, x);
        }
        return -1;
    }

}
