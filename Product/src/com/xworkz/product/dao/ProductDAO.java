package com.xworkz.product.dao;

import java.util.List;
import com.xworkz.product.Entity.ProductEntity;

public interface ProductDAO {
	void save(ProductEntity productEntity);

	void saveAll(List<ProductEntity> productEntities);

	List<ProductEntity> getAll();

	List<ProductEntity> getByPriceGreaterThan(double price);

	List<Double> getByPriceLesserThan(double price);

	ProductEntity getByNameAndId(String name, int id);// if more than one column then will take object[]
	// if we display all colums then do list

	List<ProductEntity> getTotal();

	ProductEntity getMaxPrice();

	List<ProductEntity> getTotalprice();

	String getByNameLike(String like);

	Object getQuantityByName(String name);

	Object[] getQuantityAndPriceByName(String name);

	Object[] getQuantityAndPriceByNameAndId(String name, int id);

	Object getBrandByName(String name);

	ProductEntity getByBrand(String name);

	List<Object[]> getNameAndPrice();

	List<Object[]> getNameAndPriceByBrand(String brand);

}
