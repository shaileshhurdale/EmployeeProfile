package com.example.EmployeeProfile.model;

public class EmployeeProfile {
	
	private SkillSet skillset;
	private BasicInfo basicinfo;
	
	public EmployeeProfile() {}
	
	public EmployeeProfile(SkillSet skillset, BasicInfo basicinfo) {
		super();
		this.skillset = skillset;
		this.basicinfo = basicinfo;
	}

	public SkillSet getSkillset() {
		return skillset;
	}

	public void setSkillset(SkillSet skillset) {
		this.skillset = skillset;
	}

	public BasicInfo getBasicinfo() {
		return basicinfo;
	}

	public void setBasicinfo(BasicInfo basicinfo) {
		this.basicinfo = basicinfo;
	}

	@Override
	public String toString() {
		return "EmployeeProfile [skillset=" + skillset + ", basicinfo=" + basicinfo + "]";
	}
	
}
