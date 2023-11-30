package com.simpleDepartment.service;

import java.util.List;

import com.simpleDepartment.entity.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentbyId(Long departmentId);

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

	Department fetchDepartmentByName(String departmentName);

}
