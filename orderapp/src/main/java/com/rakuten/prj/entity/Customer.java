package com.rakuten.prj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customers")
public class Customer {
	@Id
	private String email;
	@Column(name="first_name",length=100)
	private String firstName;
	
	/**
	 * @param email
	 * @param firstName
	 */
	
	public Customer(String email, String firstName) {
		this.email = email;
		this.firstName = firstName;
	}
	/**
	 * 
	 */
	public Customer() {
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return "email=" + email + ", firstName=" + firstName;
	}
	
	
}
