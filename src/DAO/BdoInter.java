package DAO;

import java.util.List;

import Exception.BDOException;
import Exception.EmpException;
import Model.Employee;
import Model.GPM;
import Model.Project;

public interface BdoInter {
       public String createProject(int pid,String pname) throws BDOException;
       public List<Project> showAllProject() throws BDOException;
       public String createNewGPM(int gpmid,String gname,String gemail,String gpassword) throws BDOException;
       public List<GPM> viewAllTheGPM() throws EmpException;
       public String allocatesProjectToGpm(int id,String gname,int pid) throws BDOException;
       public List<Employee> viewAllDetailsOfEmp() throws EmpException;
}
