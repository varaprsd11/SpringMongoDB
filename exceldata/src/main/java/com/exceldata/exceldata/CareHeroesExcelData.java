package com.exceldata.exceldata;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.bson.BSONObject;

import com.mongodb.DBObject;

public class CareHeroesExcelData implements Serializable , DBObject{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String _id;
	private String agencyName;
	private long agencyId;
	private long providerId;
	private long personId;
	private String firstName;
	
	private String middleName;
	private String lastName;
	
	private String emailAddress;
	private String personTypeCode;
	private String startDate;
	
	private String endDate;
	
	private String city;
	private long zipCode;
	private String jobTitle;
	
	private String jobType;
	private String phone ;
	
	
	
	public String getAgencyName() {
		return agencyName;
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
	
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	
	
	
	public boolean containsField(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean containsKey(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	public Object get(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	public Set<String> keySet() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object put(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	public void putAll(BSONObject arg0) {
		// TODO Auto-generated method stub
		
	}
	public void putAll(Map arg0) {
		// TODO Auto-generated method stub
		
	}
	public Object removeField(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	public Map toMap() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean isPartialObject() {
		// TODO Auto-generated method stub
		return false;
	}
	public void markAsPartialObject() {
		// TODO Auto-generated method stub
		
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	


}
