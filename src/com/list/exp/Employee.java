package com.list.exp;

public class Employee  {
	String EmpName;
	String location;

	public Employee(String empName, String location) {
		super();
		EmpName = empName;
		this.location = location;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", location=" + location + "]";
	}

}
