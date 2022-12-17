package Authentication;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import DAO.BdoImpl;
import DAO.BdoInter;
import DAO.GmpImpl;
import DAO.GmpInter;
import DTO.EmpDTO;
import Exception.BDOException;
import Exception.EmpException;
import Exception.GmpException;
import Model.Employee;
import Model.GPM;
import Model.Project;
import util.ProvideConnection;

public class Authentication {
	public static void main(String[] args) throws AutheException, BDOException {
		
		 Scanner sc= new Scanner(System.in);
		
		 System.out.println("Enter Login Credential");
		 System.out.println("Enter Email");
         String email=sc.next();
         System.out.println("Enter Password");
         String pass=sc.next();
         
         try(Connection conn=ProvideConnection.provideConnection()){
        	 PreparedStatement ps=conn.prepareStatement("select * from bdo where email=? and password=?");
        	 PreparedStatement ps1=conn.prepareStatement("select * from gmpadmin where gemail=? and gpassword=?");
        	 ps.setString(1, email);
        	 ps.setString(2, pass);
        	 ps1.setString(1, email);
        	 ps1.setString(2, pass);
        	 ResultSet rs=ps.executeQuery();
        	
        	 
        	 ResultSet rs1=ps1.executeQuery();
        	 
        	 if(rs.next()) {
        		 System.out.println("Please wait...");
        		try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		 System.out.println("BDO Section has been opened..");
        		 System.out.println("1:- "+"Create Project");
        		 System.out.println("2:- "+"Show list of Project");
        		 System.out.println("3:- "+"Create New Gram Panchayat Member");
        		 System.out.println("4:- "+"View All The list Of GPM");
        		 System.out.println("5:- "+"Allocates Project To GPM");
        		 System.out.println("6:- "+"See list of EMP working on project and wages");
        		 System.out.println("7:- "+"Log Out");
        		 System.out.println("Enter Number Which You want to do...");
        		 int i=sc.nextInt();
        		 BdoInter cr= new BdoImpl();
        		 switch(i) {
        		 case 1: 
        			 System.out.println("Enter Pid");
        			 int id=sc.nextInt();
        			 System.out.println("Enter Pname");
        			 String name=sc.next();
        			 System.out.println("Enter Issue_Date");
        			 String date=sc.next();
        			 System.out.println("Enter End_Date");
        			 String date1=sc.next();
        			 String str= cr.createProject(id, name, date, date1);
        			 System.out.println(str);
        		 case 2: 
        		     List<Project> list=cr.showAllProject(); 
        		     for(Project p:list) {
        		    	 System.out.println(p);
        		     }
        		 case 3: 
        			 System.out.println("Enter Gid");
        			 int id1=sc.nextInt();
        			 System.out.println("Enter Name");
        			 String name1=sc.next();
        			 System.out.println("Enter Email");
        			 String email1=sc.next();
        			 System.out.println("Enter Password");
        			 String pass1=sc.next();
        			String mass= cr.createNewGPM(id1, name1, email1, pass1);
        			System.out.println(mass);
        		 case 4: 
        		     List<GPM> list1;
					try {
						list1 = cr.viewAllTheGPM();
						for(GPM p:list1) {
	        		    	 System.out.println(p);
	        		     }
					} catch (GmpException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
        		 case 5:
        			 System.out.println("Enter Gid");
        			 int id2=sc.nextInt();
        			 System.out.println("Enter Gname");
        			 String name2=sc.next();
        			 System.out.println("Enter Project Id");
        			 int pid=sc.nextInt();
        			 System.out.println("Enter Allocates Date");
        			 String date2=sc.next();
        			 String massage=cr.allocatesProjectToGpm(id2, name2, pid, date2);
        		     System.out.println(massage);
        		 case 6:
        			 System.out.println("Enter Gid");
        			 int id3=sc.nextInt();
        			 System.out.println("Enter pid");
        			 int pid2=sc.nextInt();
        		     List<EmpDTO> list3;
					try {
						list3 = cr.viewAllDetailsOfEmp(id3,pid2);
						 for(EmpDTO p:list3) {
	        		    	 System.out.println(p);
	        		     }
					} catch (EmpException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
        		 case 7:
        			 return;
        		 }
        		 return;
        	 } 
        	 else if(rs1.next()) {
        		 
        		 System.out.println("Please wait...");
        		 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		 System.out.println("GMP Section has been opened..");
        		 System.out.println("1:- "+"Create Employee");
        		 System.out.println("2:- "+"View All Details Of Employee");
        		 System.out.println("3:- "+"Assign Employee To Project");
        		 System.out.println("4:- "+"View All Wages And Days");
        		 System.out.println("7:- "+"Log Out");
        		 System.out.println("Enter Number Which You want to do...");
        		 int h=sc.nextInt();
        		 GmpInter gm= new GmpImpl();
        		 switch(h) {
        		 case 1: 
        		  System.out.println("Enter Eid");
        		  int id=sc.nextInt();
        		  System.out.println("Enter EmpName");
        		  String name=sc.next();
        		  System.out.println("Enter Address");
        		  String address= sc.next();
        		  System.out.println("Enter Mobile Number");
        		  long mbl=sc.nextLong();
        		  System.out.println("Enter Working Days");
        		  int days=sc.nextInt();
        		  System.out.println("Enter Wages");
        		  int wages=sc.nextInt();
        		  System.out.println("Enter Gid");
        		  int gid=sc.nextInt();
        		  System.out.println("Enter Pid");
        		  int pid=sc.nextInt();
					try {
						String massage=gm.createEmployee(id, name, address, mbl, days, wages, gid, pid);
						System.out.println(massage);
					} catch (GmpException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
        		 case 2:
        			 try {
						List<Employee> list=gm.viewAlDetailsOfEmp();
						for(Employee e:list) {
							System.out.println(e);
						}
					} catch (GmpException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
        		 case 3:
        			 System.out.println("Enter Pid");
        			 int pid1=sc.nextInt();
        			 System.out.println("Enter Eid");
        			 int eid=sc.nextInt();
        			 try {
						String massage=gm.assignEmpToProject(pid1, eid);
						System.out.println(massage);
					} catch (GmpException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
        		 case 4:
        			 System.out.println("Enter Pid");
        			 int pid2=sc.nextInt();
        			 try {
						List<EmpDTO> list= gm.viewAllWagesAndDays(pid2);
						for(EmpDTO d:list) {
							System.out.println(d);
						}
					} catch (GmpException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 case 5: return;
        		 }
        		 return;
        	 }
        	 else {
        		 System.out.println("Please Wait....");
        		 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		 System.out.println("Credential is wrong");
        	 }
         } catch(SQLException e) {
        	 e.getStackTrace();
         }
	}
       
}
