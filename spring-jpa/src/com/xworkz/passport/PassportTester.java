package com.xworkz.passport;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.xworkz.passport.constants.BloodGroup;
import com.xworkz.passport.constants.Gender;
import com.xworkz.passport.constants.PassportPersonnelType;
import com.xworkz.passport.constants.VerifiedDocument;
import com.xworkz.passport.entity.PassportEntity;
import com.xworkz.passport.reposistry.PassportDAO;
import com.xworkz.passport.reposistry.PassportDAOImpl;
import com.xworkz.passport.service.PassportService;
import com.xworkz.passport.service.PassportServiceImp;

public class PassportTester {

	public static void main(String[] args) {
		
		PassportEntity pass= new PassportEntity("ravikumar", LocalDateTime.now(), LocalDateTime.now(),
				Gender.MALE,"A2096457", "ward no -34 bellary", "mushtaq ahmad", false,
				PassportPersonnelType.REGULAR,LocalDate.of(2000, 5, 10),BloodGroup.A_POSITIVE,VerifiedDocument.DRIVING_LICENCE);

		
		PassportDAO passDao = new PassportDAOImpl();
		PassportService passportService= new PassportServiceImp();
		passportService.validateAndSave(pass);
	}

}