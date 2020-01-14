package com.rakuten.prj.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.prj.dao.CustomerDao;
import com.rakuten.prj.dao.OrderDao;
import com.rakuten.prj.dao.ProductDao;
import com.rakuten.prj.entity.Customer;
import com.rakuten.prj.entity.LineItem;
import com.rakuten.prj.entity.Order;
import com.rakuten.prj.entity.Product;

@Service
@Transactional
public class OrderService {
	@Autowired
	private ProductDao productDao;

	public void insertProduct(Product p) {
		productDao.addProduct(p);
	}

	public Product getProduct(int id) {
		return productDao.getProduct(id);
	}

	public List<Product> getAllProducts() {
		return productDao.getProducts();
	}

	@Autowired
	private CustomerDao customerDao;

	public void insertCust(Customer c) {
		customerDao.addCustomer(c);
	}

	public Customer getCust(String email) {
		return customerDao.getCustomer(email);
	}

	public List<Customer> getAllCust() {
		return customerDao.getCustomers();
	}

	@Autowired
	private OrderDao orderDao;

	public void placeOrder(String email, int[] productIds, int[] qtys) {

		Order order = new Order();
		Customer c = customerDao.getCustomer(email);
		order.setCustomer(c); // adding thhe customer who is ordering

		double total=0.0;
		for (int j = 0; j < productIds.length; j++) {
			LineItem item = new LineItem();
			Product p = productDao.getProduct(productIds[j]);
			item.setProduct(p);
			item.setQuantity(qtys[j]);
			item.setAmount(p.getPrice() * qtys[j]);
			order.getItems().add(item);
			p.setQty(p.getQty() - qtys[j]); //dirty checking
			total += item.getAmount();
		}
		order.setTotal(total);
		orderDao.placeOrder(order);
	}

	public List<Order> getAllOrder() {
		return orderDao.getOrders();
	}
}
