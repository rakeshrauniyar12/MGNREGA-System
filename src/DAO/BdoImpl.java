package DAO;

import java.util.List;

import Exception.BDOException;
import Exception.EmpException;
import Model.Employee;
import Model.GPM;
import Model.Project;

public class BdoImpl implements BdoInter{

	@Override
	public String createProject(int pid, String pname) throws BDOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> showAllProject() throws BDOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createNewGPM(int gpmid, String gname, String gemail, String gpassword) throws BDOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GPM> viewAllTheGPM() throws EmpException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String allocatesProjectToGpm(int id, String gname, int pid) throws BDOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> viewAllDetailsOfEmp() throws EmpException {
		// TODO Auto-generated method stub
		return null;
	}

}
