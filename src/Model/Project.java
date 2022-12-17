package Model;



public class Project {
  private int pid;
  private String pname;
  private String issue_date;
  private String end_date;
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
public String getIssue_date() {
	return issue_date;
}
public void setIssue_date(String issue_date) {
	this.issue_date = issue_date;
}
public String getEnd_date() {
	return end_date;
}
public void setEnd_date(String end_date) {
	this.end_date = end_date;
}
public Project(int pid, String pname, String issue_date, String end_date) {
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
