package DAO;

import java.util.List;

import DTO.EmpDTO;
import Exception.GmpException;
import Model.Employee;

public interface GmpInter {
   public String createEmployee(int eid,String ename,String address,long mbl,int days,int wages,int gid,int pid) throws GmpException;
       public List<Employee> viewAlDetailsOfEmp() throws GmpException;
       public String assignEmpToProject(int pid,int eid) throws GmpException;
       public List<EmpDTO> viewAllWagesAndDays(int pid) throws GmpException;
}
