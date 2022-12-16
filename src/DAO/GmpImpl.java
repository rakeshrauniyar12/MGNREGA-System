package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DTO.EmpDTO;
import Exception.GmpException;
import Model.Employee;
import util.ProvideConnection;

public class GmpImpl implements GmpInter{

	@Override
	public String createEmployee(int eid, String ename, String address, long mbl, int days, int wages, int gid, int pid)
			throws GmpException {
		String massage="Not Created";
		try(Connection conn=ProvideConnection.provideConnection()){
			  PreparedStatement ps=conn.prepareStatement("insert into emp values(?,?,?,?,?,?,?,?)");
			  ps.setInt(1, eid);
			  ps.setString(2, ename);
			  ps.setString(3, address);
			  ps.setLong(4,mbl);
			  ps.setInt(5, days);
			  ps.setInt(6, wages);
			  ps.setInt(7,gid);
			  ps.setInt(8, pid);
			  int x=ps.executeUpdate();
			  if(x>0) {
				  massage="Created";
			  }
		} catch(SQLException e) {
			e.getStackTrace();
			throw new GmpException(e.getMessage());
		}
		
		return massage;
	}

	@Override
	public List<Employee> viewAlDetailsOfEmp() throws GmpException {
		List<Employee> list= new ArrayList<>();
		try(Connection conn=ProvideConnection.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from emp");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("eid");
				String name=rs.getString("ename");
				String address=rs.getString("address");
				long mbl=rs.getLong("mobile");
				int days=rs.getInt("days");
				int wages=rs.getInt("wages");
				int gid=rs.getInt("gid");
				int pid=rs.getInt("pid");
				Employee emp= new Employee();
				emp.setEid(id);
				emp.setEname(name);
				emp.setAddress(address);
				emp.setMobile(mbl);
				emp.setDays(days);
				emp.setWages(wages);
				emp.setGid(gid);
				emp.setPid(pid);
				list.add(emp);
			}
		} catch(SQLException e) {
			e.getStackTrace();
			throw new GmpException();
		}
		
		
		return list;
	}

	@Override
	public String assignEmpToProject(int pid,int eid) throws GmpException {
		String massage="Not Assigned";
		try(Connection conn=ProvideConnection.provideConnection()){
			  PreparedStatement ps=conn.prepareStatement("update emp set pid=? where eid=?");
			  ps.setInt(1,pid);
			  ps.setInt(2, eid);
			  int x=ps.executeUpdate();
			  if(x>0) {
				  massage="Assigned";
			  }
		} catch(SQLException e) {
			e.getStackTrace();
			throw new GmpException(e.getMessage());
		}
		
		return massage;
	}

	@Override
	public List<EmpDTO> viewAllWagesAndDays(int pid) throws GmpException {
		List<EmpDTO> list= new ArrayList<>();
		try(Connection conn=ProvideConnection.provideConnection()){
			PreparedStatement ps=conn.prepareStatement("select eid,ename,days,wages,gid from emp where pid=?");
			ps.setInt(1, pid);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("eid");
				String name=rs.getString("ename");
				int gid=rs.getInt("gid");
				int days=rs.getInt("days");
				int wages=rs.getInt("wages");
			
				EmpDTO emp= new EmpDTO();
				emp.setEid(id);
				emp.setEname(name);
				emp.setGid(gid);
				emp.setDays(days);
				emp.setWages(wages);
			
				list.add(emp);
			}
		} catch(SQLException e) {
			e.getStackTrace();
			throw new GmpException();
		}
		
		return list;
	}

	

}

