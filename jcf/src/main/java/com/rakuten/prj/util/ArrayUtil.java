package com.rakuten.prj.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.rakuten.prj.entity.Triplet;

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
	public static List<Triplet> printTriplets(int[] data) {
		List<Triplet> tri=new ArrayList<>();
		int sum=0;
		//int sum2=0;
		for (int i = 0; i < data.length; i++) {
			for (int j = i+1; j < data.length; j++) {
				sum=data[i]+data[j];
				for (int k = 0; k < data.length; k++) {
					if(sum == data[k]) {
						tri.add(new Triplet(data[i],data[j],sum));
					}
				}
				//tri.add(new Triplet(data[i],sum,data[i]+sum));
			}
		}
		//Triplet e =new Triplet(1,2,5);
		
		return tri;
		
	}
}
