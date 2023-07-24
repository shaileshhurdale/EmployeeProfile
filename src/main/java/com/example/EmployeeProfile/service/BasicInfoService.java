package com.example.EmployeeProfile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.example.EmployeeProfile.model.BasicInfo;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class BasicInfoService {
	
	Logger logger = LoggerFactory.getLogger(BasicInfoService.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@CircuitBreaker(name="BasicInfo", fallbackMethod = "retrieveBasicInfoFallback")
	public BasicInfo retrieveBasicInfo() {
		return restTemplate.getForObject("http://BASIC-INFO-SERVICE/basicinfo/1", BasicInfo.class);
	}
	
	public BasicInfo retrieveBasicInfoFallback(Exception e) {
		logger.error("error occurred while calling Basic info service");
		return new BasicInfo("default_name", "default_job", "0");
	}

}
