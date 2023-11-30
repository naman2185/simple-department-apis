package com.simpleDepartment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long depatmentId;
	
	@NotBlank(message = "please add department name")
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	public Department(long depatmentId, String departmentName, String departmentAddress, String departmentCode) {
		super();
		this.depatmentId = depatmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}
	
	public Department() {}
	
	public long getDepatmentId() {
		return depatmentId;
	}
	public void setDepatmentId(long depatmentId) {
		this.depatmentId = depatmentId;
	}
	public String getdepartmentName() {
		return departmentName;
	}
	public void setdepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	@Override
	public String toString() {
		return "Department [depatmentId=" + depatmentId + ", departmentName=" + departmentName
				+ ", departmentAddress=" + departmentAddress + ", departmentCode=" + departmentCode + "]";
	}
	

}
