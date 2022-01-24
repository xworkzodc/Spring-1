package com.xworkz.cosmetics;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.dao.CosmeticDAOImpl;
import com.xworkz.cosmetics.entity.CosmeticEntity;
import com.xworkz.cosmetics.service.CosmeticService;
import com.xworkz.cosmetics.service.CosmeticServiceImpl;

public class CosmeticScanner {

	public static void main(String[] args) {
		
		CosmeticEntity cosmeticEntity= new CosmeticEntity("mushtaq", "null", 8214550382l, "bangalore", 583101,"male", 1, "trimer", 2, 2450.5, "hair remove",LocalDate.now(),"mushtaq",LocalDateTime.now(),"naveen",LocalDateTime.now(),"password");
		
		CosmeticEntity coEntity = new CosmeticEntity("mushtaq", "mushtaq.xworkz@gmail.com", 821745054l, "bangalore", 583101,"male", 1, "trimer", 2, 2450.5, "hair remove",LocalDate.now(),"mushtaq",LocalDateTime.now(),"password");
		
//		CosmeticDAO cosmeticDAO= new CosmeticDAOImpl();
//		cosmeticDAO.save(cosmeticEntity1);
		
		CosmeticService cosmeticService = new CosmeticServiceImpl();
		cosmeticService.validateAndSave(coEntity);
		
	
	}

}
