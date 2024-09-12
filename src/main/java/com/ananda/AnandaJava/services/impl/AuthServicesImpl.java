package com.ananda.AnandaJava.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ananda.AnandaJava.model.UserAuthToken;
import com.ananda.AnandaJava.model.UserRoles;
import com.ananda.AnandaJava.model.Users;
import com.ananda.AnandaJava.response.ResponseHandling;
import com.ananda.AnandaJava.services.AuthServices;
import com.springBootTest.exception.UserDataNotFoundException;
import com.ananda.AnandaJava.CustomUtils.Constants;
import com.ananda.AnandaJava.CustomUtils.UniversalFunction;
import com.ananda.AnandaJava.body.AuthTokenBody;
import com.ananda.AnandaJava.body.ReqBody;
import com.ananda.AnandaJava.body.VerifyOtpBody;
import com.ananda.AnandaJava.dao.UserAuthTokenDao;
import com.ananda.AnandaJava.dao.UserDao;
import com.ananda.AnandaJava.dao.UserRolesDao;
import com.ananda.AnandaJava.jwt.JwtService;

@Service
public class AuthServicesImpl implements AuthServices {
	
//	private static final List<Users> ResponseHandler = null;

	@Autowired
	private UserAuthTokenDao userAuthTokenDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserRolesDao userRolesDao;

	@Override
	public ResponseEntity<Object> login(ReqBody reqBody) {
		
		List<Users> usrData = userDao.findByEmailId(reqBody.getEmail());
		
		if(usrData.size() == 0) {
			Users users = new Users();
			users.setEmailId(reqBody.getEmail());
			
			Users result = userDao.save(users);
			
			UserRoles userRoles = new UserRoles();
			userRoles.setRoleId(1);
			userRoles.setUserId(result.getId());
			
			userRolesDao.save(userRoles);
			
			
//		throw new UserDataNotFoundException("user not found");
		return ResponseHandling.responseBuilder("Otp send successfully", HttpStatus.OK, "");
	}else {
		
		 UniversalFunction UniversalFunction = new UniversalFunction();
		 
		 String otp = UniversalFunction.randomIntString(5);
		  
		  UserAuthToken userAuthToken = new UserAuthToken();

		  userAuthToken.setUserId(usrData.get(0).getId());
		  userAuthToken.setUserRoleId(Constants.getGuestuserroletype());
		  userAuthToken.setVerificationOtp(otp);
		  userAuthToken.setIsOtpValid(0);
		  userAuthToken.setIsVerified(0);
		  userAuthToken.setOtpFor("email");
		  userAuthToken.setCreatedBy(Integer.toString(usrData.get(0).getId()));
		  userAuthToken.setUpdatedBy(Integer.toString(usrData.get(0).getId()));
		  
		  System.out.println("userAuthToken " + userAuthToken);
		  
		  // insert OTP and other details in user_auth_token table
		  userAuthTokenDao.save(userAuthToken);
		  
		  // send OTP function here  
		return ResponseHandling.responseBuilder("Otp send successfully", HttpStatus.OK, otp);
	}
	}

//	@SuppressWarnings({ })
	@Override
	public ResponseEntity<Object> verifyOtp(VerifyOtpBody verifyOtpBody) {
		
		List<Users> usrData = userDao.findByEmailId(verifyOtpBody.getEmail());
		
		if(usrData.size() == 0) {
		throw new UserDataNotFoundException("user not found");
		}else {
			
			List<UserAuthToken> userAuthTokenData = userAuthTokenDao.findByUserIdOrderByIdDesc(usrData.get(0).getId());
			
			if(userAuthTokenData.isEmpty()) {
				throw new UserDataNotFoundException("data not found");
			}else {
				if(userAuthTokenData.get(0).getVerificationOtp().equals(verifyOtpBody.getOtp())) {
					
					  JwtService jwtService = new JwtService();
					  
					  AuthTokenBody authTokenBody = new AuthTokenBody();
					  
					  authTokenBody.setEmail(usrData.get(0).getEmailId());
					  authTokenBody.setUserId(usrData.get(0).getId());
					  authTokenBody.setUserRoleId(Constants.getGuestuserroletype());
					  
					  String jwtToken = jwtService.generateToken(authTokenBody);
					  
					  UserAuthToken userAuthToken2 = new UserAuthToken();
					  
					     userAuthToken2.setId(userAuthTokenData.get(0).getId());
						 userAuthToken2.setAccessToken(jwtToken);
						 userAuthToken2.setIsOtpValid(1);
						 userAuthToken2.setIsVerified(1);
						 
					  System.out.println("\nuserAuthToken>> " + userAuthToken2);
					  
					  // insert OTP and other details in user_auth_token table
					  userAuthTokenDao.save(userAuthToken2);
					  
					  return ResponseHandling.responseBuilder("Login Success", HttpStatus.OK, userAuthToken2);
					
				}else {
					throw new UserDataNotFoundException("otp is wrong");
				}
			}
			
		}
	}
}
