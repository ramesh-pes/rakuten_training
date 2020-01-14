package com.rakuten.prj.entity;

public class Triplet {
	int first;
	int second;
	int sum;
	/**
	 * 
	 */
	public Triplet() {
	}
	/**
	 * @param first
	 * @param second
	 * @param sum
	 */
	public Triplet(int first, int second, int sum) {
		this.first = first;
		this.second = second;
		this.sum = sum;
	}
	/**
	 * @return the first
	 */
	public int getFirst() {
		return first;
	}
	/**
	 * @param first the first to set
	 */
	public void setFirst(int first) {
		this.first = first;
	}
	/**
	 * @return the second
	 */
	public int getSecond() {
		return second;
	}
	/**
	 * @param second the second to set
	 */
	public void setSecond(int second) {
		this.second = second;
	}
	/**
	 * @return the sum
	 */
	public int getSum() {
		return sum;
	}
	/**
	 * @param sum the sum to set
	 */
	public void setSum(int sum) {
		this.sum = sum;
	}
	@Override
	public String toString() {
		return "<"+ first + "," + second + "," + sum + ">";
	}
	
}
