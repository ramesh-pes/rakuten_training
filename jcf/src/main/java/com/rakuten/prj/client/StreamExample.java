package com.rakuten.prj.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.rakuten.prj.entity.Product;

public class StreamExample {

	public static void main(String[] args) {
		
		String str = "Java is OOP,Java is open source";
		String[] li= str.split(" ");
		
		Map<String,Integer> freq=new HashMap<String, Integer>();
		for (String f : li) {
			if(freq.containsKey(f)) {
				freq.put(f,freq.get(f)+1);
			}else {
				freq.put(f, 1);
			}
		}
		System.out.println(freq);
		//freq.stream()
		//System.out.println(li[1]);
		
		
		
		
		List<Product> products = new ArrayList<>();
        products.add(new Product(645, "Hp Laptop", 135000.00, "computer"));
        products.add(new Product(224, "iPhone", 98000.00, "mobile"));
        products.add(new Product(834, "Logitech Mouse", 600.00, "computer"));
        products.add(new Product(5, "Sony Bravia", 125000.00, "tv"));
        products.add(new Product(912, "One Plus", 32000.00, "mobile"));
        products.add(new Product(88, "HP Printer", 19000.00, "computer"));
        
        //filtering
        List<Product> mobiles=
        		products.stream()
        		.filter((p) ->p.getCategory().equalsIgnoreCase("mobile"))
        		.collect(Collectors.toList());
        
        //mobiles.forEach(p->System.out.println(p)); // lambda expression
        mobiles.forEach(System.out::println); // method reference
        products.stream().map(p->p.getName())
        .forEach(System.out::println);
        
        //reduce
        double sum=products.stream().map(p->p.getPrice())
        		.reduce(0.0, (v,u)->u+v);
        System.out.println(sum);
        
        //create
        Map<String,List<Product>> productsCat = products.stream()
        		.collect(Collectors.groupingBy(p->p.getCategory()));
        List<Product> computers=productsCat.get("computer");
        for (Product com : computers) {
			System.out.println(com);
		}
        
        
	}
}
