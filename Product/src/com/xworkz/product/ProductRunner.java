package com.xworkz.product;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.product.Entity.ProductEntity;
import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;

public class ProductRunner {

	public static void main(String[] args) {

		List<ProductEntity> list = new ArrayList<ProductEntity>();
		list.add(new ProductEntity("iphone 13", 1, "apple", 145000, 4.5f));
		list.add(new ProductEntity("gyser", 2, "bajaj", 14000, 4.1f));
		list.add(new ProductEntity("wasing machine", 1, "whirlpool", 18000, 4.2f));
		list.add(new ProductEntity("television", 3, "sony", 49000, 4.3f));
		list.add(new ProductEntity("shoe", 8, "bata", 1500, 3.8f));
		list.add(new ProductEntity("iron box", 2, "orient", 2200, 4.1f));
		list.add(new ProductEntity("wooden bed", 1, "royal oak", 65000, 4.3f));
		list.add(new ProductEntity("matterrs", 2, "sleep well", 32000, 3.9f));
		list.add(new ProductEntity("refrigerator", 1, "haier", 18000, 3.5f));
		list.add(new ProductEntity("laptop", 1, "dell", 48000, 4.1f));
		list.add(new ProductEntity("charger", 5, "Mi", 600d, 2.8f));
		list.add(new ProductEntity("bluetooth", 1, "boat", 4000, 4.0f));
		list.add(new ProductEntity("watch", 6, "titen", 2400, 4.1f));
		list.add(new ProductEntity("bulb", 15, "syska", 55, 3.4f));
		list.add(new ProductEntity("fan", 5, "usha", 1900, 3.8f));
		list.add(new ProductEntity("goggle", 2, "ray-ban", 1200, 4.3f));
		list.add(new ProductEntity("Jacket", 3, "nike", 2401, 3.4f));
		list.add(new ProductEntity("gold ring", 1, "malabar", 24000, 3.5f));
		list.add(new ProductEntity("sanitizer", 4, "santoor", 45, 2.5f));
		list.add(new ProductEntity("mask", 12, "N95", 50, 3.1f));
		list.add(new ProductEntity("bag", 2, "skybag", 2400, 4.1f));
		list.add(new ProductEntity("soap", 24, "sandalwood", 49, 4.2f));

		ProductDAO productDAO = new ProductDAOImpl();
		// productDAO.save(null);
		// productDAO.saveAll(list);

//	List<ProductEntity> pro= productDAO.getAll();
//	System.out.println(pro);

//	List<ProductEntity> pro1= productDAO.getByPriceGreaterThan(45d);
//	System.out.println(pro1);
//	System.out.println(productDAO.getByPriceLesserThan(75000d));

//	
//	ProductEntity ob= productDAO.getByNameAndId("gyser",2);
//	System.out.println(ob);	   

//	List<ProductEntity> product = productDAO.getTotal();
//	System.out.println(product);	 //-->22

//	ProductEntity p1 = productDAO.getMaxPrice();
//	System.out.println(p1); --all column and max price

//	 List<ProductEntity> p2= productDAO.getTotalprice();
//	 System.out.println(p2);

//	String name=productDAO.getByNameLike("g");
//	System.out.println(name);

//	Object obj1= productDAO.getQuantityByName("iphone 13");
//	System.out.println(obj1);

//	Object[] obj = productDAO.getQuantityAndPriceByName("gold ring");
//	System.out.println(obj[0]);
//	System.out.println(obj[1]);
//	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");

//	Object[] obj1 = productDAO.getQuantityAndPriceByNameAndId("soap", 22);
//	System.out.println(obj1[0]);
//	System.out.println(obj1[1]);

//	System.out.println(productDAO.getBrandByName("charger"));

//	System.out.println(productDAO.getByBrand("television"));

//	List<Object[]> o1= productDAO.getNameAndPrice();
//	for (Object[] objects : o1) {
//		String name=(String) objects[0];
//		Double price=(Double) objects[1];
//		
//		System.out.print("product name="+name+", ");
//		System.out.println("product price="+price+" ");
//	}
//		List<Object[]> aaa = productDAO.getNameAndPriceByBrand("apple");
//		for (Object[] objects : aaa) {
//			String name = (String) objects[0];
//			Double price = (Double) objects[1];
//			System.out.print("product name=" + name + ", ");
//			System.out.println("product price=" + price + " ");
//		}
	}
}