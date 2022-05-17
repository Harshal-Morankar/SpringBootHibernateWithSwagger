package com.csi.service;

import com.csi.model.Employee;

import java.util.List;

public interface EmployeeService {
    void signUp(Employee employee);

    boolean signIn(String empEmailId, String empPassword);

    void saveBulOfData(List<Employee> employees);

    Employee getDataById(int empId);

    Employee getDataByEmail(String empEmailId);

    Employee getDataByContactNumber(long empContactNumber);

    List<Employee> getAllData();

    List<Employee> filterData(double empSalary);

    void updateData(int empId, Employee employee);

    void deleteDataById(int empId);

    void deleteAllData();
}
