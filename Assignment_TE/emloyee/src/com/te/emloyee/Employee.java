package com.te.emloyee;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Serializable {
	private Integer employeeId;
	private String password;
	private String employeeName;
	private LocalDate dOB;
	private LocalDate dOJ;
	
	public Employee() {
		
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public LocalDate getdOB() {
		return dOB;
	}

	public void setdOB(LocalDate dOB) {
		this.dOB = dOB;
	}

	public LocalDate getdOJ() {
		return dOJ;
	}

	public void setdOJ(LocalDate dOJ) {
		this.dOJ = dOJ;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", password=" + password + ", employeeName=" + employeeName
				+ ", dOB=" + dOB + ", dOJ=" + dOJ + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dOB, dOJ, employeeId, employeeName, password);
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
		return Objects.equals(dOB, other.dOB) && Objects.equals(dOJ, other.dOJ)
				&& Objects.equals(employeeId, other.employeeId) && Objects.equals(employeeName, other.employeeName)
				&& Objects.equals(password, other.password);
	}
	
	
	
	
 
}
