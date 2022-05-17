package com.csi.service;

import com.csi.dao.EmployeeDao;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDao employeeDaoimpl;


    @Override
    public void signUp(Employee employee) {
        employeeDaoimpl.signUp(employee);
    }

    @Override
    public boolean signIn(String empEmailId, String empPassword) {
        return employeeDaoimpl.signIn(empEmailId, empPassword);
    }

    @Override
    public void saveBulOfData(List<Employee> employees) {
        employeeDaoimpl.saveBulOfData(employees);
    }

    @Override
    public Employee getDataById(int empId) {
        return employeeDaoimpl.getDataById(empId);
    }

    @Override
    public Employee getDataByEmail(String empEmailId) {
        return employeeDaoimpl.getDataByEmail(empEmailId);
    }

    @Override
    public Employee getDataByContactNumber(long empContactNumber) {
        return employeeDaoimpl.getDataByContactNumber(empContactNumber);
    }

    @Override
    public List<Employee> getAllData() {
        return employeeDaoimpl.getAllData();
    }

    @Override
    public List<Employee> filterData(double empSalary) {
        return employeeDaoimpl.filterData(empSalary);
    }

    @Override
    public void updateData(int empId, Employee employee) {
        employeeDaoimpl.updateData(empId, employee);
    }

    @Override
    public void deleteDataById(int empId) {
        employeeDaoimpl.deleteDataById(empId);
    }

    @Override
    public void deleteAllData() {
        employeeDaoimpl.deleteAllData();
    }




}
