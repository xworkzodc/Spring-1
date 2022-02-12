package com.xworkz.cosmetics.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import com.xworkz.cosmetics.entity.CosmeticEntity;
import com.xworkz.util.SingletonEMFUtil;

public class CosmeticDAOImpl implements CosmeticDAO{

	@Override
	public void save(CosmeticEntity cosmeticEntity) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(cosmeticEntity);
			entityManager.getTransaction().commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		} finally {
			entityManager.close();
		}

	}

}