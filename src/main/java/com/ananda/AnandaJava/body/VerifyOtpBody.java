package com.ananda.AnandaJava.body;

public class VerifyOtpBody {
	
	 public String email;
	 public String language;
	 public String otp;
	 
	 public String deviceToken;
	 public String deviceType;
	 public String deviceModel;
	 public String osVersion;
	 public String deviceIp;
	 
	 
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
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
	
	public VerifyOtpBody(String email, String language, String otp, String deviceToken, String deviceType,
			String deviceModel, String osVersion, String deviceIp) {
		super();
		this.email = email;
		this.language = language;
		this.otp = otp;
		this.deviceToken = deviceToken;
		this.deviceType = deviceType;
		this.deviceModel = deviceModel;
		this.osVersion = osVersion;
		this.deviceIp = deviceIp;
	}
	public VerifyOtpBody() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "VerifyOtpBody [email=" + email + ", language=" + language + ", otp=" + otp + ", deviceToken="
				+ deviceToken + ", deviceType=" + deviceType + ", deviceModel=" + deviceModel + ", osVersion="
				+ osVersion + ", deviceIp=" + deviceIp + "]";
	}
	
}
