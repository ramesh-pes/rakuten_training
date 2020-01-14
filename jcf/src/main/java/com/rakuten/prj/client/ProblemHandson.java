package com.rakuten.prj.client;

import java.util.List;

import com.rakuten.prj.entity.Triplet;
import com.rakuten.prj.util.ArrayUtil;

public class ProblemHandson {
	public static void main(String[] args) {
		int[] data= {2,3,4,5,7};
		List<Triplet> t=ArrayUtil.printTriplets(data);
		for (Triplet t1 : t) {
			System.out.println(t1);
		}
		
	}
}
