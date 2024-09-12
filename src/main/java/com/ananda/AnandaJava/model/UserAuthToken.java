package com.ananda.AnandaJava.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
//@Table(name=”UserAuthToken”) // user_auth_token
public class UserAuthToken {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //IDENTITY
    private Long id;
	private Integer userId; 
	private Integer userRoleId;
    private String userRoleTitle; 
    private String accessToken; 
	private LocalDateTime accessTokenCreation;
	private int accessTokenExpiry=0;
	
	private String deviceToken; 
	private String deviceType; 
	private String deviceModel; 
	private String osVersion; 
	private String deviceIp; 
	private String otpFor; 

	private String verificationOtp; 
	private Integer isOtpValid; 
	private Integer isVerified; 
	private String updatedBy; 
	private String createdBy;
	private int isActive = 1; 
	private int isDeleted = 0;
	
	public UserAuthToken(int id, Integer userId, Integer userRoleId, String userRoleTitle, String accessToken,
			LocalDateTime accessTokenCreation, int accessTokenExpiry, String deviceToken, String deviceType,
			String deviceModel, String osVersion, String deviceIp, String verificationOtp, Integer isOtpValid,
			Integer isVerified, String updatedBy, String createdBy, Integer isActive, Integer isDeleted) {
		super();
		this.id = (long) id;
		this.userId = userId;
		this.userRoleId = userRoleId;
		this.userRoleTitle = userRoleTitle;
		this.accessToken = accessToken;
		this.accessTokenCreation = accessTokenCreation;
		this.accessTokenExpiry = accessTokenExpiry;
		this.deviceToken = deviceToken;
		this.deviceType = deviceType;
		this.deviceModel = deviceModel;
		this.osVersion = osVersion;
		this.deviceIp = deviceIp;
		this.verificationOtp = verificationOtp;
		this.isOtpValid = isOtpValid;
		this.isVerified = isVerified;
		this.updatedBy = updatedBy;
		this.createdBy = createdBy;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
	}
	public UserAuthToken() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return (Long) id;
	}
	public void setId(Long long1) {
		this.id = (long) long1;
	}
	public String getOtpFor() {
		return otpFor;
	}
	public void setOtpFor(String otpFor) {
		this.otpFor = otpFor;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}
	public String getUseRoleTitle() {
		return userRoleTitle;
	}
	public void setUseRoleTitle(String userRoleTitle) {
		this.userRoleTitle = userRoleTitle;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public LocalDateTime getAccessTokenCreation() {
		return accessTokenCreation;
	}
	public int getAccessTokenExpiry() {
		return accessTokenExpiry;
	}
	public void setAccessTokenExpiry(int accessTokenExpiry) {
		System.out.println("accessTokenExpiry" + accessTokenExpiry);
		this.accessTokenExpiry = accessTokenExpiry;
	}
	public String getDeviceToken() {
		return deviceToken;
	}
	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getDeviceModel() {
		return deviceModel;
	}
	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public String getDeviceIp() {
		return deviceIp;
	}
	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
	}
	public String getVerificationOtp() {
		return verificationOtp;
	}
	public void setVerificationOtp(String verificationOtp) {
		this.verificationOtp = verificationOtp;
	}
	public Integer getIsOtpValid() {
		return isOtpValid;
	}
	public void setIsOtpValid(Integer isOtpValid) {
		this.isOtpValid = isOtpValid;
	}
	public Integer getIsVerified() {
		return isVerified;
	}
	public void setIsVerified(Integer isVerified) {
		this.isVerified = isVerified;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Integer getIsActive() {
		return isActive;
	}
	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}
	public Integer getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
	@Override
	public String toString() {
		return "UserAuthToken [id=" + id + ", userId=" + userId + ", userRoleId=" + userRoleId + ", useRoleTitle="
				+ userRoleTitle + ", accessToken=" + accessToken + ", accessTokenCreation=" + accessTokenCreation
				+ ", accessTokenExpiry=" + accessTokenExpiry + ", deviceToken=" + deviceToken + ", deviceType="
				+ deviceType + ", deviceModel=" + deviceModel + ", osVersion=" + osVersion + ", deviceIp=" + deviceIp
				+ ", verificationOtp=" + verificationOtp + ", isOtpValid=" + isOtpValid + ", isVerified=" + isVerified
				+ ", updatedBy=" + updatedBy + ", createdBy=" + createdBy + ", isActive=" + isActive + ", isDeleted="
				+ isDeleted + "]";
	}
	public String getUserRoleTitle() {
		return userRoleTitle;
	}
	public void setUserRoleTitle(String userRoleTitle) {
		this.userRoleTitle = userRoleTitle;
	}
	
	
	
}
