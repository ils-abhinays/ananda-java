package com.ananda.AnandaJava.services;

import org.springframework.http.ResponseEntity;

import com.ananda.AnandaJava.body.ReqBody;
import com.ananda.AnandaJava.body.VerifyOtpBody;

public interface AuthServices {
	
	ResponseEntity<Object> login(ReqBody reqBody);
	ResponseEntity<Object> verifyOtp(VerifyOtpBody verifyOtpBody);
	
}


