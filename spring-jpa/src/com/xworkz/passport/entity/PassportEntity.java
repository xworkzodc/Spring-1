package com.xworkz.passport.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.passport.constants.BloodGroup;
import com.xworkz.passport.constants.Gender;
import com.xworkz.passport.constants.PassportPersonnelType;
import com.xworkz.passport.constants.VerifiedDocument;

@Table (name="passport_details")
public class PassportEntity {
@Id
@Column (name="p_id")
	private int id;
@Column (name="p_issuedBy")
	private String issuedBy;
@Column (name="p_issuedAt")
	private LocalDateTime issuedAt;
@Column (name="p_expiresAt")
	private LocalDateTime expiresAt;
@Column (name="p_gender")
	private Gender gender;
@Column (name="p_passportNo")
	private String passportNo;
@Column (name="p_address")
	private String address;
@Column (name="p_fullName")
	private String fullName;
@Column (name="p_legalIssue")
	private boolean legalIssue;
@Column (name="p_passportPersonnelType")
	private PassportPersonnelType passportPersonnelType;
@Column (name="p_dob")
	private LocalDate dob;
@Column (name="p_bloodGroup")
	private BloodGroup bloodGroup;
@Column (name="p_verifiedDocument")
	private VerifiedDocument  verifiedDocument;
	
	
	public PassportEntity( String issuedBy, LocalDateTime issuedAt, LocalDateTime expiresAt, Gender gender,
			String passportNo, String address, String fullName, boolean legalIssue,
			PassportPersonnelType passportPersonnelType, LocalDate dob, BloodGroup bloodGroup,
			VerifiedDocument verifiedDocument) {
		super();
		
		this.issuedBy = issuedBy;
		this.issuedAt = issuedAt;
		this.expiresAt = expiresAt;
		this.gender = gender;
		this.passportNo = passportNo;
		this.address = address;
		this.fullName = fullName;
		this.legalIssue = legalIssue;
		this.passportPersonnelType = passportPersonnelType;
		this.dob = dob;
		this.bloodGroup = bloodGroup;
		this.verifiedDocument = verifiedDocument;
	}
	
	
	@Override
	public String toString() {
		return "PassportEntity [id=" + id + ", issuedBy=" + issuedBy + ", issuedAt=" + issuedAt + ", expiresAt="
				+ expiresAt + ", gender=" + gender + ", passportNo=" + passportNo + ", address=" + address
				+ ", fullName=" + fullName + ", legalIssue=" + legalIssue + ", passportPersonnelType="
				+ passportPersonnelType + ", dob=" + dob + ", bloodGroup=" + bloodGroup + ", verifiedDocument="
				+ verifiedDocument + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((bloodGroup == null) ? 0 : bloodGroup.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((expiresAt == null) ? 0 : expiresAt.hashCode());
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + id;
		result = prime * result + ((issuedAt == null) ? 0 : issuedAt.hashCode());
		result = prime * result + ((issuedBy == null) ? 0 : issuedBy.hashCode());
		result = prime * result + (legalIssue ? 1231 : 1237);
		result = prime * result + ((passportNo == null) ? 0 : passportNo.hashCode());
		result = prime * result + ((passportPersonnelType == null) ? 0 : passportPersonnelType.hashCode());
		result = prime * result + ((verifiedDocument == null) ? 0 : verifiedDocument.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PassportEntity other = (PassportEntity) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bloodGroup != other.bloodGroup)
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (expiresAt == null) {
			if (other.expiresAt != null)
				return false;
		} else if (!expiresAt.equals(other.expiresAt))
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (gender != other.gender)
			return false;
		if (id != other.id)
			return false;
		if (issuedAt == null) {
			if (other.issuedAt != null)
				return false;
		} else if (!issuedAt.equals(other.issuedAt))
			return false;
		if (issuedBy == null) {
			if (other.issuedBy != null)
				return false;
		} else if (!issuedBy.equals(other.issuedBy))
			return false;
		if (legalIssue != other.legalIssue)
			return false;
		if (passportNo != other.passportNo)
			return false;
		if (passportPersonnelType != other.passportPersonnelType)
			return false;
		if (verifiedDocument != other.verifiedDocument)
			return false;
		return true;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIssuedBy() {
		return issuedBy;
	}
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}
	public LocalDateTime getIssuedAt() {
		return issuedAt;
	}
	public void setIssuedAt(LocalDateTime issuedAt) {
		this.issuedAt = issuedAt;
	}
	public LocalDateTime getExpiresAt() {
		return expiresAt;
	}
	public void setExpiresAt(LocalDateTime expiresAt) {
		this.expiresAt = expiresAt;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public boolean isLegalIssue() {
		return legalIssue;
	}
	public void setLegalIssue(boolean legalIssue) {
		this.legalIssue = legalIssue;
	}
	public PassportPersonnelType getPassportPersonnelType() {
		return passportPersonnelType;
	}
	public void setPassportPersonnelType(PassportPersonnelType passportPersonnelType) {
		this.passportPersonnelType = passportPersonnelType;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public VerifiedDocument getVerifiedDocument() {
		return verifiedDocument;
	}
	public void setVerifiedDocument(VerifiedDocument verifiedDocument) {
		this.verifiedDocument = verifiedDocument;
	}

	
}
