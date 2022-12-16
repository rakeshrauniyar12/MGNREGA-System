package Model;

import java.sql.Date;

public class Project {
  private int pid;
  private String pname;
  private Date issue_date;
  private Date end_date;
@Override
public String toString() {
	return "Project [pid=" + pid + ", pname=" + pname + ", issue_date=" + issue_date + ", end_date=" + end_date + "]";
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Date getIssue_date() {
	return issue_date;
}
public void setIssue_date(Date issue_date) {
	this.issue_date = issue_date;
}
public Date getEnd_date() {
	return end_date;
}
public void setEnd_date(Date end_date) {
	this.end_date = end_date;
}
public Project(int pid, String pname, Date issue_date, Date end_date) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.issue_date = issue_date;
	this.end_date = end_date;
}
public Project() {
	super();
}
   
}
