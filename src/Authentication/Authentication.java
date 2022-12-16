package Authentication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import util.ProvideConnection;

public class Authentication {
	public static void main(String[] args) throws AutheException {
		
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
