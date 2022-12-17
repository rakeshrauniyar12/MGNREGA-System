package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.EmpDTO;
import Exception.BDOException;
import Exception.EmpException;
import Exception.GmpException;
import Model.GPM;
import Model.Project;
import util.ProvideConnection;

public class BdoImpl implements BdoInter{

	@Override
	public String createProject(int pid, String pname, String issue_date, String end_date) throws BDOException {
		String massage="Not Created";
		try(Connection conn=ProvideConnection.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("insert into project values(?,?,?,?)");
			ps.setInt(1,pid);
			ps.setString(2,pname);
			ps.setString(3, issue_date);
			ps.setString(4, end_date);
			int x=ps.executeUpdate();
			if(x>0) {
				massage="Created";
			}
		} catch(SQLException e) {
			e.getStackTrace();
			throw new BDOException(e.getMessage());
		}
		
		
		return massage;
	}

	@Override
	public List<Project> showAllProject() throws BDOException {
		List<Project> list= new ArrayList<>();
        try(Connection conn=ProvideConnection.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("select * from project");
				ResultSet rs=ps.executeQuery();	
				while(rs.next()) {
					  int pid=rs.getInt("pid");
					  String name=rs.getString("pname");
					  String date=rs.getString("issue_date");
					  String date1= rs.getString("end_date");
					Project p= new Project();
					p.setPid(pid);
					p.setPname(name);
					p.setIssue_date(date);
					p.setEnd_date(date1);
					list.add(p);
				}
		} catch(SQLException e) {
			e.getStackTrace();
			throw new BDOException(e.getMessage());
		}
		return list;
	}

	@Override
	public String createNewGPM(int gid, String gname, String gemail, String gpassword) throws BDOException {
		String massage="Not Created";
		
		try(Connection conn=ProvideConnection.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("insert into gpm values(?,?,?,?)");
			 ps.setInt(1, gid);
			 ps.setString(2,gname);
			 ps.setString(3, gemail);
			 ps.setString(4, gpassword);
			 int x=ps.executeUpdate();
			 if(x>0) {
				 massage="Created";
			 }
		} catch(SQLException e) {
			e.getStackTrace();
			throw new BDOException(e.getMessage());
		}
		
		return massage;
	}

	@Override
	public List<GPM> viewAllTheGPM() throws GmpException {
		List<GPM> list= new ArrayList<>();
        try(Connection conn=ProvideConnection.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("select * from gpm");
				ResultSet rs=ps.executeQuery();	
				while(rs.next()) {
					  int pid=rs.getInt("gid");
					  String name=rs.getString("gname");
					  String email=rs.getString("gemail");
					  String gpass= rs.getString("gpassword");
					GPM p= new GPM();
					p.setGid(pid);
					p.setGname(name);
					p.setGemail(email);
					p.setGpassword(gpass);
					list.add(p);
				}
		} catch(SQLException e) {
			e.getStackTrace();
			throw new GmpException(e.getMessage());
		}
		return list;
	}

	@Override
	public String allocatesProjectToGpm(int gid, String gname, int pid, String allocates_date) throws BDOException {
		   String massage="Not Allocated";
		   try(Connection conn=ProvideConnection.provideConnection()){
			    PreparedStatement ps= conn.prepareStatement("insert into gpmwork values(?,?,?,?)");
			    ps.setInt(1, gid);
			    ps.setString(2, gname);
			    ps.setInt(3,pid);
			    ps.setString(4, allocates_date);
			    int x=ps.executeUpdate();
			    if(x>0) {
			    	massage="Allocated";
			    }
		   } catch(SQLException e) {
			   e.getStackTrace();
			   throw new BDOException(e.getMessage());
		   }
		   return massage;
	}

	@Override
	public List<EmpDTO> viewAllDetailsOfEmp(int gid, int pid) throws EmpException {
		List<EmpDTO> list= new ArrayList<>();
		try(Connection conn=ProvideConnection.provideConnection()){
			PreparedStatement ps=conn.prepareStatement(" select e.ename,e.gid,e.days,e.wages from emp e inner join gpmwork g inner join project p on p.pid=? and e.pid=? and e.gid=? and g.gid=?");
		    ps.setInt(1, pid);
		    ps.setInt(2, pid);
		    ps.setInt(3, gid);
		    ps.setInt(4, gid);
			ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			String name=rs.getString("ename");
			int id=rs.getInt("gid");
			int days=rs.getInt("days");
			int wages=rs.getInt("wages");
			EmpDTO e= new EmpDTO();
			e.setEname(name);
			e.setGid(id);
			e.setDays(days);
			e.setWages(wages);
			list.add(e);
		}
		} catch(SQLException e) {
			e.getStackTrace();
			throw new EmpException(e.getMessage());
		}
		
		return list;
	}



}
