package com.rakuten.prj.client;

import java.util.Arrays;
//import java.util.Comparator;

import com.rakuten.prj.entity.Product;

public class ArrayExample {

	public static void main(String[] args) {
		String[] names = { "ramesh", "zebra", "kat", "alfa" };
		Arrays.sort(names);
		for (String nam : names) {
			System.out.println(nam);
		}
		Arrays.sort(names, (s1, s2) -> s1.length() - s2.length());
		for (String nam : names) {
			System.out.println(nam);
		}
		Product[] products = new Product[6];
		products[0] = new Product(645, "Hp Laptop", 135000.00, "computer");
		products[1] = new Product(224, "iPhone", 98000.00, "mobile");
		products[2] = new Product(834, "Logitech Mouse", 600.00, "computer");
		products[3] = new Product(5, "Sony Bravia", 125000.00, "tv");
		products[4] = new Product(912, "One Plus", 32000.00, "mobile");
		products[5] = new Product(88, "HP Printer", 19000.00, "computer");
		/*
		 * Arrays.sort(products,new Comparator<Product>() {
		 * 
		 * @Override public int compare(Product o1, Product o2) {
		 * 
		 * }
		 * 
		 * });
		 */

		Arrays.sort(products, (p1, p2) -> (int) (p1.getPrice() - p2.getPrice()));
		for (Product product : products) {
			System.out.println(product.getName() + "price" + product.getPrice());
		}

	}

}
