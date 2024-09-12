package com.ananda.AnandaJava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ananda.AnandaJava.body.ReqBody;
import com.ananda.AnandaJava.body.VerifyOtpBody;
import com.ananda.AnandaJava.services.AuthServices;

@RestController
public class AuthController {
	
	@Autowired
	private AuthServices authServices;
	
	@GetMapping("/test")
	public String test(){
		return "Test ananda App";
	}
	
	@PostMapping("/user/login")
	public ResponseEntity<Object> login(@RequestBody ReqBody reqBody){
		return this.authServices.login(reqBody);
	}
	
	@PostMapping("/user/verifyOtp")
	public ResponseEntity<Object> verifyOtp(@RequestBody VerifyOtpBody verifyOtpBody){
		return this.authServices.verifyOtp(verifyOtpBody);
	}
}
