package com.te.console_based_application;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {
	private Integer employeeId;
	private String employeeName;
	private Integer age;
	private String location;
	
	public Employee() {
		
	}


	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", age=" + age + ", location="
				+ location + "]\n";
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, employeeId, employeeName, location);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(age, other.age) && Objects.equals(employeeId, other.employeeId)
				&& Objects.equals(employeeName, other.employeeName) && Objects.equals(location, other.location);
	}
	
	
	
	
	
	
	
	

}
