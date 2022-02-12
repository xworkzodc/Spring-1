package com.xworkz.cosmetics.entity;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table (name="customer_details")
public class CosmeticEntity {
	@Id
	@Column (name="c_id")
	private int id;
	@Column (name="c_name")
	private String name;
	@Column (name="c_email")
	private String email;
	@Column (name="c_phone_Num")
	private long phonenumber;
	@Column (name="c_address")
	private String address;
	@Column (name="c_pincode")
	private int pincode;
	@Column (name="c_gender")
	private String gender;
	@Column (name="o_id")
	private int oId;
	@Column (name="p_name")
	private String Pname;
	@Column (name="p_quantity")
	private int Pquantity;
	@Column (name="p_price")
	private double price;
	@Column (name="p_type")
	private String Ptype;
	@Column (name="o_date")
	private LocalDate localDate;
	@Column (name="created_By")
	private String createdBy;
	@Column (name="created_at")
	private LocalDateTime createdAt;
	@Column (name="updated_By")
	private String updatedBy;
	@Column (name="updated_at")
	private LocalDateTime updatedAt;
	@Column (name="c_password")
	private String password;
	
	
	public CosmeticEntity(String name, String email, long phonenumber, String address, int pincode, String gender,
			int oId, String pname, int pquantity, double price, String ptype, LocalDate localDate, String createdBy,
			LocalDateTime createdAt, String updatedBy, LocalDateTime updatedAt, String password) {
		super();
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.address = address;
		this.pincode = pincode;
		this.gender = gender;
		this.oId = oId;
		this.Pname = pname;
		this.Pquantity = pquantity;
		this.price = price;
		this.Ptype = ptype;
		this.localDate = localDate;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedBy = updatedBy;
		this.updatedAt = updatedAt;
		this.password=password;
	}

	public CosmeticEntity(String name, String email, long phonenumber, String address, int pincode, String gender,
			int oId, String pname, int pquantity, double price, String ptype, LocalDate localDate, String createdBy,
			LocalDateTime createdAt,String password) {
		super();
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.address = address;
		this.pincode = pincode;
		this.gender = gender;
		this.oId = oId;
		Pname = pname;
		Pquantity = pquantity;
		this.price = price;
		Ptype = ptype;
		this.localDate = localDate;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.password=password;
	}
	
	
}