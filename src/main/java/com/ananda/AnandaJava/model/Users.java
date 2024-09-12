package com.ananda.AnandaJava.model;

import java.time.LocalDateTime;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import java.time.LocalDateTime;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //IDENTITY
    private int id;
	private String gumnutStaffId; 
    private String firstName; 
    private String lastName; 
    private String emailId; 
    private String gumnutEmail; 
    private String phoneNumber; 
    private String dateOfBirth; 
    private String gender; 
    private String profilePic; 
    private String address; 
    private Integer departmentId; 
    private int isPasswodSet; 
    private String gumnutPassword; 
    private LocalDateTime registrationDatetime; 
    private LocalDateTime lastLoginDatetime;
    private String source; 
    private int isEmailidVerified; 
    private int isPhoneNumberVerified; 
    private String country; 
    private String state; 
    private String city; 
    private String zipcode; 
    private LocalDateTime updationDatetime;
    private Integer createdBy; 
    private int updatedBy; 
    private int isActive; 
    private int isDeleted;
    
   // Constructor
	
	 // Getter and Setters
	public Users(int id, String gumnutStaffId, String firstName, String lastName, String emailId, String gumnutEmail,
		String phoneNumber, String dateOfBirth, String gender, String profilePic, String address, Integer departmentId,
		int isPasswodSet, String gumnutPassword, LocalDateTime registrationDatetime, LocalDateTime lastLoginDatetime,
		String source, int isEmailidVerified, int isPhoneNumberVerified, String country, String state, String city,
		String zipcode, LocalDateTime updationDatetime, Integer createdBy, int updatedBy, int isActive, int isDeleted) {
	super();
	this.id = id;
	this.gumnutStaffId = gumnutStaffId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailId = emailId;
	this.gumnutEmail = gumnutEmail;
	this.phoneNumber = phoneNumber;
	this.dateOfBirth = dateOfBirth;
	this.gender = gender;
	this.profilePic = profilePic;
	this.address = address;
	this.departmentId = departmentId;
	this.isPasswodSet = isPasswodSet;
	this.gumnutPassword = gumnutPassword;
	this.registrationDatetime = registrationDatetime;
	this.lastLoginDatetime = lastLoginDatetime;
	this.source = source;
	this.isEmailidVerified = isEmailidVerified;
	this.isPhoneNumberVerified = isPhoneNumberVerified;
	this.country = country;
	this.state = state;
	this.city = city;
	this.zipcode = zipcode;
	this.updationDatetime = updationDatetime;
	this.createdBy = createdBy;
	this.updatedBy = updatedBy;
	this.isActive = isActive;
	this.isDeleted = isDeleted;
}
    public int getId() {
		return id;
	}
	public String getGumnut_staff_id() {
		return gumnutStaffId;
	}
	public void setGumnut_staff_id(String gumnut_staff_id) {
		this.gumnutStaffId = gumnut_staff_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getGumnutEmail() {
		return gumnutEmail;
	}
	public void setGumnutEmail(String gumnutEmail) {
		this.gumnutEmail = gumnutEmail;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public int getIsPasswodSet() {
		return isPasswodSet;
	}
	public void setIsPasswodSet(int isPasswodSet) {
		this.isPasswodSet = isPasswodSet;
	}
	public String getGumnutPassword() {
		return gumnutPassword;
	}
	public void setGumnutPassword(String gumnutPassword) {
		this.gumnutPassword = gumnutPassword;
	}
	public LocalDateTime getRegistrationDatetime() {
		return registrationDatetime;
	}
	public void setRegistrationDatetime(LocalDateTime registrationDatetime) {
		this.registrationDatetime = registrationDatetime;
	}
	public LocalDateTime getLastLoginDatetime() {
		return lastLoginDatetime;
	}
	public void setLastLoginDatetime(LocalDateTime lastLoginDatetime) {
		this.lastLoginDatetime = lastLoginDatetime;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public int getIsEmailidVerified() {
		return isEmailidVerified;
	}
	public void setIsEmailidVerified(int isEmailidVerified) {
		this.isEmailidVerified = isEmailidVerified;
	}
	public int getIsPhoneNumberVerified() {
		return isPhoneNumberVerified;
	}
	public void setIsPhoneNumberVerified(int isPhoneNumberVerified) {
		this.isPhoneNumberVerified = isPhoneNumberVerified;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public LocalDateTime getUpdationDatetime() {
		return updationDatetime;
	}
	public void setUpdationDatetime(LocalDateTime updationDatetime) {
		this.updationDatetime = updationDatetime;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public int getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	public void setId(int id) {
		this.id = id;
	}
	// Default Constructor
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// To String Method
	@Override
	public String toString() {
		return "Users [id=" + id + ", gumnutStaffId=" + gumnutStaffId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", emailId=" + emailId + ", gumnutEmail=" + gumnutEmail + ", phoneNumber=" + phoneNumber
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", profilePic=" + profilePic + ", address="
				+ address + ", departmentId=" + departmentId + ", isPasswodSet=" + isPasswodSet + ", gumnutPassword="
				+ gumnutPassword + ", registrationDatetime=" + registrationDatetime + ", lastLoginDatetime="
				+ lastLoginDatetime + ", source=" + source + ", isEmailidVerified=" + isEmailidVerified
				+ ", isPhoneNumberVerified=" + isPhoneNumberVerified + ", country=" + country + ", state=" + state
				+ ", city=" + city + ", zipcode=" + zipcode + ", updationDatetime=" + updationDatetime + ", createdBy="
				+ createdBy + ", updatedBy=" + updatedBy + ", isActive=" + isActive + ", isDeleted=" + isDeleted + "]";
	}
//	public Users getGeneratedKeys() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}
