package com.Micro.demo.Service;

import com.Micro.demo.Entity.Employee;
import com.Micro.demo.Entity.Team;

import java.util.List;

public interface ServiceImple {

    public Employee InsertEmployeeService(Employee employee);
    public Team InsertTeamService(Team team);
    public Employee GetByIdEmployeeService(Long emplID);
    public Employee UpdateEmployeeService(Employee employee);
    public List<Employee> GetAllEmployeeService();

}
