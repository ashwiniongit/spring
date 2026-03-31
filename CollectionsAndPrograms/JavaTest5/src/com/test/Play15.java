package com.test;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Play15 {
	
	public static void main(String[] args){
		
		// WRITE a pgm to sort an array of n size,
		int[] arr = {3,6,9,0,4,5,15};
		qSort(arr,0,arr.length - 1);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void qSort(int[] arr,int start, int end) {
		if(start<end) {
			int partitionIndex = partition(arr, start, end);
			qSort(arr, start, partitionIndex - 1);
			qSort(arr, partitionIndex + 1, end);
		}
	}
	
	public static int partition(int[] arr, int start, int end) {
		int piv = arr[end];
		int i = start - 1;
		for(int j = start; j<end; j++) {
			if(arr[j] < piv) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = temp;
		return i+1;
	}
}
