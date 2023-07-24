package com.example.EmployeeProfile.model;

import java.util.List;

public class SkillSet {
	private List<String> skills;
	
	public SkillSet() {}

	public SkillSet(List<String> skills) {
		super();
		this.skills = skills;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "SkillSet [skills=" + skills + "]";
	}

}
