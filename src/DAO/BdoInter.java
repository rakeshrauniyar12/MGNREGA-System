package DAO;

import java.sql.Date;
import java.util.List;

import DTO.EmpDTO;
import Exception.BDOException;
import Exception.EmpException;
import Exception.GmpException;
import Model.GPM;
import Model.Project;

public interface BdoInter {
       public String createProject(int pid,String pname,String date,String date1) throws BDOException;
       public List<Project> showAllProject() throws BDOException;
       public String createNewGPM(int gid,String gname,String gemail,String gpassword) throws BDOException;
       public List<GPM> viewAllTheGPM() throws GmpException;
       public String allocatesProjectToGpm(int gid,String gname,int pid,String allocates_date) throws BDOException;
       public List<EmpDTO> viewAllDetailsOfEmp(int gid,int pid) throws EmpException;
}
