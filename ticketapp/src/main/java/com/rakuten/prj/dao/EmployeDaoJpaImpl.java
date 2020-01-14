package com.rakuten.prj.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.rakuten.prj.entity.Employe;

@Repository
public class EmployeDaoJpaImpl implements EmployeDao {
	@PersistenceContext
	public EntityManager em;
	

	@Override
	public void addEmploye(Employe e) {
		// TODO Auto-generated method stub
		em.persist(e);
	}

	@Override
	public Employe getEmploye(int id) {
		// TODO Auto-generated method stub
		return em.find(Employe.class, id);
	}

}
