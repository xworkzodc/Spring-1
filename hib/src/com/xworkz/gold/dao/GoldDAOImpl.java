package com.xworkz.gold.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.xworkz.gold.util.GoldEntity;
import com.xworkz.util.SingletonEMFUtil;


public class GoldDAOImpl implements GoldDAO{

	@Override
	public void save(GoldEntity gold) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(gold);
			entityManager.getTransaction().commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		} finally {
			entityManager.close();
		}
		
	}

	@Override
	public void getAll() {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<GoldEntity> cr = cb.createQuery(GoldEntity.class);
		Root<GoldEntity> root = cr.from(GoldEntity.class);
		cr.select(root);

		Query query = entityManager.createQuery(cr);
		List<GoldEntity> results = query.getResultList();
		System.out.println(results);
		
		
	}//cr.select(root).where(cb.gt(root.get("itemPrice"), 1000));
	//  ParameterExpression<Integer> p = cb.parameter(Integer.class);
//	  q.select(c).where(cb.gt(c.get("population"), p));
	@Override
	public GoldEntity getPriceGreaterThan(double price) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<GoldEntity> cr = cb.createQuery(GoldEntity.class);
		Root<GoldEntity> root = cr.from(GoldEntity.class);
		ParameterExpression<Double> p=cb.parameter(Double.class);
		cr.select(root).where(cb.gt(root.get("goldPriceFor10Gm"),price));
		 TypedQuery<GoldEntity> query = entityManager.createQuery(cr);
		  List<GoldEntity> result= query.getResultList();
		 System.out.println(result);
		return null;
	}

}
