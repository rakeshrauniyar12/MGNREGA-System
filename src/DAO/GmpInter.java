package DAO;

import java.util.List;

import Exception.GmpException;
import Model.Employee;

public interface GmpInter {
       public String createEmployee(int eid,String ename,String address,long mbl,int days,int wages,int gid) throws GmpException;
       public List<Employee> viewAlDetailsOfEmp() throws GmpException;
       public String assignEmpToProject(int pid) throws GmpException;
       public List<Employee> viewAllWagesAndDays() throws GmpException;
}
