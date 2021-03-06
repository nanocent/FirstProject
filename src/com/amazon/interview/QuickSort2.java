package com.amazon.interview;

import java.util.Arrays;

public class QuickSort2 {

	public static void main(String[] args) {

		int[] arr = { 9, 10, 15, 6, 4, 8, 12, 1, 12, 3, 4, 500, 60000, 7898565, 12345, 0111, 12334, 12356, 7658, 23490,
				10000, 203456, 98999, 1000000 };

		quickSort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {

		int pivot = arr[low + (high - low) / 2];
		int i = (low - 1);

		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

}
