package com.xworkz.product.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.product.Entity.ProductEntity;
import com.xworkz.util.SingletonEMFUtil;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public void save(ProductEntity productEntity) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(productEntity);
			entityManager.getTransaction().commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		} finally {
			entityManager.close();
		}

	}

	@Override
	public void saveAll(List<ProductEntity> productEntities) {

		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			int flush = 0;
			entityManager.getTransaction().begin();
			for (ProductEntity productEntity : productEntities) {
				entityManager.persist(productEntity);
				if (flush >= 10) { // 1>>2>>3
					entityManager.flush();
					System.out.println("flushing the data");
					flush = 0;
					entityManager.clear();
					System.out.println("clear the data");
				}
				flush++;
			}
			entityManager.getTransaction().commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		} finally {
			entityManager.close();
		}
	}

	@Override
	public List<ProductEntity> getAll() {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getAll");
			List<ProductEntity> obj = query.getResultList();

			return (obj);
		} catch (PersistenceException e) {
			// TODO: handle exception
		}

		return null;
	}

	@Override
	public List<ProductEntity> getByPriceGreaterThan(double price) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getByPriceGreaterThan");
			query.setParameter("pri", price);
			
			return (List<ProductEntity>) query.getResultList();
		} catch (PersistenceException e) {
			entityManager.getTransaction().rollback();
		}
		return null;
	}

	@Override
	public List<Double> getByPriceLesserThan(double price) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getByPriceLesserThan");
			query.setParameter("pri", price);
			return (List<Double>) query.getResultList();
		} catch (PersistenceException e) {
			entityManager.getTransaction().rollback();
		}
		return null;
	}

	@Override
	public ProductEntity getByNameAndId(String name, int id) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getByNameAndId");
			query.setParameter("nam", name);
			query.setParameter("id", id);

			return (ProductEntity) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ProductEntity> getTotal() {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getTotal");
			query.getSingleResult();
			return (List<ProductEntity>) query.getResultList();

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ProductEntity getMaxPrice() {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getMaxPrice");
			Object result = query.getSingleResult();
			ProductEntity entity = (ProductEntity) result;
			System.out.println("result fetched for max");
			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ProductEntity> getTotalprice() {

		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getTotalprice");
			query.getSingleResult();

			return (List<ProductEntity>) query.getResultList();

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String getByNameLike(String like) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getByNameLike");
			query.setParameter("lik", like);

			return (String) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Object getQuantityByName(String name) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getQuantityByname");
			query.setParameter("quan", name);

			return (Object) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Object[] getQuantityAndPriceByName(String name) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getQuantityAndPriceByName");
			query.setParameter("name", name);

			return (Object[]) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Object[] getQuantityAndPriceByNameAndId(String name, int id) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getQuantityAndPriceByNameAndId");
			query.setParameter("name", name);
			query.setParameter("id", id);

			return (Object[]) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Object getBrandByName(String name) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getBrandByName");
			query.setParameter("brand", name);

			return (Object) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ProductEntity getByBrand(String name) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getByBrand");
			query.setParameter("brand", name);

			return (ProductEntity) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Object[]> getNameAndPrice() {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getNameAndPrice");

			return (List<Object[]>) query.getResultList();

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public List<Object[]> getNameAndPriceByBrand(String brand) {
		EntityManager entityManager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getNameAndPriceByBrand");
			query.setParameter("brand", brand);

			return (List<Object[]>) query.getResultList();

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}
}