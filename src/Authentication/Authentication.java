package Authentication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import util.ProvideConnection;

public class Authentication {
	public static void main(String[] args) throws InterruptedException {
		
		 Scanner sc= new Scanner(System.in);
		
		 System.out.println("Enter Login Credential");
         String email=sc.next();
         String pass=sc.next();
         
         try(Connection conn=ProvideConnection.provideConnection()){
        	 PreparedStatement ps=conn.prepareStatement("select * from bdo where email=? and password=?");
        	 ps.setString(1, email);
        	 ps.setString(2, pass);
        	 PreparedStatement ps1=conn.prepareStatement("select * from gmp where email=? and password=?");
        	 ps1.setString(1, email);
        	 ps1.setString(2, pass);
        	 ResultSet rs=ps.executeQuery();
        	 ResultSet rs1=ps1.executeQuery();
        	 if(rs.next()) {
        		 System.out.println("Please wait...");
        		 Thread.sleep(3000);
        		 System.out.println("BDO Section has been opened");
        	 } 
        	 else if(rs1.next()) {
        		 System.out.println("Please wait...");
        		 Thread.sleep(3000);
        		 System.out.println("GMP Section has been opened");
        	 }
        	 else {
        		 System.out.println("Please Wait....");
        		 Thread.sleep(3000);
        		 System.out.println("Credential is wrong");
        	 }
         } catch(SQLException e) {
        	 e.getStackTrace();
         }
	}
       
}
