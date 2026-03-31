package com.test;

import java.util.*;

public class TripletCount {

    public static int getTripletCount(List<Integer> a, int d){
        int count = 0;
        int n = a.size();

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = a.get(i) + a.get(j) + a.get(k);
                    if (sum % d == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(3, 3, 4, 7, 8));
        int d = 5;
        int result = getTripletCount(arr, d);
        System.out.println("Number of distinct triplets: " + result);
    }
}


