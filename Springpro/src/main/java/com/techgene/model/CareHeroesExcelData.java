package com.techgene.model;

import java.io.Serializable;
import java.util.Date;

public class CareHeroesExcelData implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String agencyName;
	private long agencyId;
	private long providerId;
	private long personId;
	private String firstName;
	
	private String middleName;
	private String lastName;
	
	private String emailAddress;
	private String personTypeCode;
	private Date startDate;
	
	private Date endDate;
	
	private String city;
	private long zipCode;
	private String jobTitle;
	
	private String jobType;
	private long phone ;
	
	
	
	public String getAgencyName() {
		return agencyName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public long getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(long agencyId) {
		this.agencyId = agencyId;
	}
	public long getProviderId() {
		return providerId;
	}
	public void setProviderId(long providerId) {
		this.providerId = providerId;
	}
	public long getPersonId() {
		return personId;
	}
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPersonTypeCode() {
		return personTypeCode;
	}
	public void setPersonTypeCode(String personTypeCode) {
		this.personTypeCode = personTypeCode;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	
	
	
	
	
	
	

}
