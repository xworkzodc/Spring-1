package com.xworkz.cosmetics.service;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.dao.CosmeticDAOImpl;
import com.xworkz.cosmetics.entity.CosmeticEntity;

public class CosmeticServiceImpl implements CosmeticService {

	private CosmeticDAO dao = new CosmeticDAOImpl();

	@Override
	public boolean validateAndSave(CosmeticEntity entity) {
		try {
			boolean valid = true;
			
		if (entity.getName() != null && entity.getName().length() > 3 && entity.getName().length() < 25
					) {

				if (entity.getEmail() != null&& entity.getEmail().endsWith(".com")) {

					if (entity.getPhonenumber() != 0 && entity.getPhonenumber() > 0 && entity.getPhonenumber() <= 10000000000l) {

						if (entity.getAddress() != null && entity.getAddress().length() > 5
								&& entity.getAddress().length() < 50) {

							if (entity.getPincode() != 0 && entity.getPincode() > 3 && entity.getPincode() < 80215615) {

								if (entity.getGender() != null && entity.getGender().length() > 3
										&& entity.getGender().length() < 6) {

									if (entity.getOId() != 0 && entity.getOId() > 0 && entity.getOId() < 5) {

										if (entity.getPname() != null && entity.getPname().length()>3) {

											if (entity.getPquantity() != 0 && entity.getPquantity() > 0
													&& entity.getPquantity() < 1000) {

												if (entity.getPrice() != 0 && entity.getPrice() > 0) {

													if (entity.getPtype() != null) {

														if (entity.getLocalDate() != null) {

															if (entity.getCreatedBy() != null) {

																if (entity.getCreatedAt() != null) {
																	
																	if(entity.getPassword()!=null && entity.getPassword().length()>4) {
																		if (valid)dao.save(entity);
																	}
																		else {
																		System.err.println("invalid password");
																	}
																}
																	else {
																		System.err.println("not valid dateandtime");
																	}
																} else {
																	System.err.println("not valid name");
																}
															} else {
																System.err.println("invalid date");
															}
														} else {
															System.err.println("type not valid");
														}
													}

													else {
														System.err.println("price not valid");
													}
												} else {
													System.err.println("invalid quantity");
												}
											} else {
												System.err.println("invalid product name");
											}
										} else {
											System.err.println("invalid oredrid");
										}
									} else {
										System.err.println("invalid gender");
									}
								} else {
									System.err.println("invalid pincode");
								}
							} else {
								System.err.println("invalid address");
							}
						} else {
							System.err.println("phonenum not valid");
						}

					} else {
						System.err.println("invalid email");
					}
				} else {
					System.err.println("invalid name");
				}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}