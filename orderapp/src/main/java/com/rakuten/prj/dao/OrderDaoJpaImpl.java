package com.rakuten.prj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rakuten.prj.entity.Order;

@Repository
public class OrderDaoJpaImpl implements OrderDao {

		@PersistenceContext
		private EntityManager em;
		
	@Override
	public void placeOrder(Order order) {
		// TODO Auto-generated method stub
		em.persist(order);
	}

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		String jpql= "from Order";
		TypedQuery<Order> query= em.createQuery(jpql,Order.class);
		return query.getResultList();
	}

}
