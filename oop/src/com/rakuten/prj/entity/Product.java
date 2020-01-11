/**
 * 
 */
package com.rakuten.prj.entity;

/**
 * this is business data to represnt product innformation
 *  
 * @author ramesh
 * @version 1.0
 * 
 */
public class Product {
	private int id;
	private String name;
	private double price;
	/**
	 * 
	 */
	public Product() {//default connstructor
	}
	/**
	 * @param id product id
	 * @param name product name
	 * @param price product price
	 */
	public Product(int id, String name, double price) {// parameterized constuctors
		this.id = id;
		this.name = name;
		this.price = price;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * this method is to find if product is expensive or not
	 * 
	 * @return true if expennsive 
	 */
	public boolean isExpennsive() {
		return false;
	}
	
}
