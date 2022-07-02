package com.Structural.Adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList(){

        List<Employee> employees=new ArrayList<>();

        Employee employeFromDB=new EmployeeDB("1234","John","wick","john@wick.com");
        EmployeeLdap employeFromLdap=new EmployeeLdap("chwie","John","wick","john@wick.com");
        EmployeeCSV employeeCSV=new EmployeeCSV("567,sherlock,holmes,holmes@sherlock.com");
        employees.add(employeFromDB);
        employees.add(new EmployeeAdapterLdap(employeFromLdap));
        employees.add(new EmployeeAdapterCSV(employeeCSV));

        return employees;

    }

}
