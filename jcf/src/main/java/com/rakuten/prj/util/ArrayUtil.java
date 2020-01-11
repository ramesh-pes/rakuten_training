package com.rakuten.prj.util;

import java.util.Arrays;

public class ArrayUtil {
	public static int getSum(int[] data) {
		int sum = 0;
		for (int num1 : data) {
			sum += num1;
		}
		return sum;
	}

	public static int getOccurence(int[] data, int no) {
		int count = 0;
		for (int i : data) {
			if (no == i)
				count++;
		}
		return count;
	}

	public static int[] sort(int[] data) {
		Arrays.parallelSort(data);
		return data;
	}

	public static void sort(Comparable[] items) {
		for (int i = 0; i < items.length; i++) {
			for (int j = i+1; j < items.length; j++) {
				if (items[i].compareTo(items[j])>0) {
					Comparable temp=items[i];
					items[i]=items[j];
					items[j]=items[i];
				}
			}
		}
	}
}
