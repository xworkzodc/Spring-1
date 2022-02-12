package com.xworkz.cosmetics.service;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.dao.CosmeticDAOImpl;
import com.xworkz.cosmetics.entity.CosmeticEntity;

public class CosmeticServiceImpl implements CosmeticService {
	
	public CosmeticDAO dao;

	

	@Override
	public boolean validateAndSave(CosmeticEntity entity) {
		try {
			boolean valid = true;

			if (entity.getName() != null && entity.getName().length() > 3 && entity.getName().length() < 25) {
				valid = true;
			} else {
				
				System.err.println("invalid name ");
				System.err.println("chararcter >3&<25");
				return false;
			}

			if (entity.getEmail() != null && entity.getEmail().length()>4&&entity.getEmail().contains("@")&&entity.getEmail().contains(".")) {
				valid = true;
			} else {
				System.err.println("invalid email");
				System.err.println("chararcter >3 & < 25 contain '.' '@'");
				return false;
			}
			if (entity.getPhonenumber() != 0 && entity.getPhonenumber()>1000000000l
					&& entity.getPhonenumber() < 10000000000l) {	
				valid = true;
			} else {							 						
				System.err.println("phonenum not valid");
				System.err.println("number >9&<10");
				return false;
			}
			if (entity.getAddress() != null && entity.getAddress().length() > 5 && entity.getAddress().length() < 50) {
				valid = true;
			} else {
				System.err.println("invalid address");
				System.err.println("chararcter >5&<50");
				return false;
			}
			if (entity.getPincode() != 0 && entity.getPincode() > 3 && entity.getPincode() < 1000000) {
				valid = true;
			} else {																		 
				System.err.println("invalid pincode");
				
				return false;
			}
			if (entity.getGender() != null && entity.getGender().contains("male")||entity.getGender().contains("female")
					||entity.getGender().contains("other")) {
				valid = true;
			} else {
				System.err.println("invalid gender");
				System.err.println("all lower case");
				return false;
			}
			if (entity.getOId() != 0 && entity.getOId() > 0 && entity.getOId() < 1000) {
				valid = true;
			} else {
				System.err.println("invalid oredrid");
				return false;
			}

			if (entity.getPname() != null && entity.getPname().length() > 2 && entity.getPname().length() < 15) {
				valid = true;
			} else {
				System.err.println("invalid product name");
				System.err.println("character >2");
				return false;
			}
			if (entity.getPquantity() != 0 && entity.getPquantity() > 0 && entity.getPquantity() < 1000) {
				valid = true;
			} else {
				System.err.println("invalid quantity");
				return false;
			}
			if (entity.getPrice() != 0 && entity.getPrice() > 0) {
				valid = true;
			} else {
				System.err.println("price not valid");
				return false;
			}

			if (entity.getPtype() != null) {
				valid = true;
			} else {
				System.err.println("type not valid");
				return false;
			}
			if (entity.getLocalDate() != null) {
				valid = true;
			} else {
				System.err.println("invalid date");
				return false;
			}

			if (entity.getCreatedBy() != null && entity.getCreatedBy().length()>3 ) {
				valid = true;
			} else {
				System.err.println("not valid name");
				System.err.println("chararcter >3");

				return false;
			}
			if (entity.getCreatedAt() != null) {
				valid = true;
			} else {
				System.err.println("not valid dateandtime");
				return false;
			}
			if (entity.getPassword() != null && entity.getPassword().length() > 4 
					&& entity.getPassword().length() > 14 && entity.getPassword().contains("&")||
					entity.getPassword().contains("@")||entity.getPassword().contains(".")) {
				valid = true;
			} else {
				System.err.println("invalid password");
				System.err.println("must contain './@/&' '>4&<14'");

				return false;
			}
			if (valid)
				dao.save(entity);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}



}