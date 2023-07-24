package com.example.EmployeeProfile.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.example.EmployeeProfile.model.SkillSet;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class SkillSetService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@CircuitBreaker(name="skillSet", fallbackMethod = "retrieveSkillSetFallback")
	public SkillSet retrieveSkillSet() {
		return restTemplate.getForObject("http://SKILL-INFO-SERVICE/skillinfo/1", SkillSet.class);
	}
	
	public SkillSet retrieveSkillSetFallback(Exception e) {
		return new SkillSet(Arrays.asList("default_skills"));
	}

}
