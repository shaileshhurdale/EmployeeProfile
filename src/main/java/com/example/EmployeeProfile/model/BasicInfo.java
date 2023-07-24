package com.example.EmployeeProfile.model;

public class BasicInfo {
	private String name;
	private String designation;
	private String empNumber;
	
	public BasicInfo() {}

	public BasicInfo(String name, String designation, String empNumber) {
		super();
		this.name = name;
		this.designation = designation;
		this.empNumber = empNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}

	@Override
	public String toString() {
		return "BasicInfo [name=" + name + ", designation=" + designation + ", empNumber=" + empNumber + "]";
	}

}
