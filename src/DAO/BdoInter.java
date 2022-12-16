package DAO;

import java.sql.Date;

public interface BdoInter {
      public String createProject(int pid,String pname,Date issue_date,Date end_date) throws BDOException;
       public List<Project> showAllProject() throws BDOException;
       public String createNewGPM(int gid,String gname,String gemail,String gpassword) throws BDOException;
       public List<GPM> viewAllTheGPM() throws GmpException;
       public String allocatesProjectToGpm(int gid,String gname,int pid,Date allocates_date) throws BDOException;
       public List<EmpDTO> viewAllDetailsOfEmp(int gid,int pid) throws EmpException;
}
