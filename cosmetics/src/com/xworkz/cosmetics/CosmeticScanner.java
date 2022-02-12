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
		
		CosmeticEntity coEntity = new CosmeticEntity("mushtaq", "mushtaq.xworkz@gmail.com", 8217450387l, "bangalore", 583101,"male", 1, "trimer", 2, 2450.5, "hair remove",LocalDate.now(),"mushtaq",LocalDateTime.now(),"mushtaq@1");
		CosmeticEntity coEntity1 = new CosmeticEntity("ahamad", "ahamad.xworkz@gmail.com", 921745054l, "bellary", 583102,"male", 2, "comb", 3, 245.5, "hairstyle",LocalDate.now(),"mushtaq",LocalDateTime.now(),"password@123");
		CosmeticEntity coEntity2 = new CosmeticEntity("priya", "priya.xworkz@gmail.com", 9217148547l, "mysore", 583105,"female", 4, "nailpolish", 3, 245.5, "madicure",LocalDate.now(),"mushtaq",LocalDateTime.now(),"priya@654");
		CosmeticEntity coEntity3 = new CosmeticEntity("kajol", "kaljol.xworkz@gmail.com", 8874531668l, "hospet", 583715,"female", 5, "hair dryer", 3, 245.5, "electronic hairstyle",LocalDate.now(),"mushtaq",LocalDateTime.now(),"kajol.sm");
		CosmeticEntity coEntity4 = new CosmeticEntity("anusha", "anusharymec@gmail.com", 948057866l, "hampi", 583615,"female", 7, "make up set", 5, 1456, "Allproduct",LocalDate.now(),"mushtaq",LocalDateTime.now(),"anushap&@123");

		
	//	CosmeticDAO cosmeticDAO= new CosmeticDAOImpl();
	//	cosmeticDAO.save(coEntity4);
		

		
		CosmeticService cosmeticService = new CosmeticServiceImpl();
		cosmeticService.validateAndSave(coEntity4);
//		
	
		
	}

}