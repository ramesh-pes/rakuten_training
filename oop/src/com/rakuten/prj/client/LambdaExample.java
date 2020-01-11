package com.rakuten.prj.client;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaExample {
	public static void main(String[] args) {
		Function<Integer, Double> f1 = new Function<Integer, Double>() {

			@Override
			public Double apply(Integer t) {
				return t / 2.0;
			}

		};
		System.out.println(f1.apply(5));

		Function<Integer, Double> f2 = (Integer t) -> {
			return t / 2.0;
		};
		System.out.println(f2.apply(10));

		Function<Integer, Double> f3 = t -> t / 2.0;
		System.out.println(f3.apply(15));

		BiFunction<Integer, Integer, Integer> ad1 = (t, t1) -> (t + t1);
		System.out.println(ad1.apply(5, 4));

		BiFunction<Integer, Integer, Integer> mul = (t1, t2) -> (t1 * t2);
		System.out.println(mul.apply(4, 5));
		BiFunction<Integer, Integer, Double> ad11= new BiFunction<Integer, Integer, Double>() {

			@Override
			public Double apply(Integer t, Integer u) {
				return (double) (t+u);
			}
			
		};
		System.out.println(ad11.apply(10, 15));
	}

}
