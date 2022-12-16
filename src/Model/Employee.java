package Model;

public class Employee {
  private int eid;
  private String ename;
  private String address;
  private int days;
  private int wages;
  private int gid;
  private int pid;
  private long mobile;
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + ", days=" + days + ", wages=" + wages
			+ ", gid=" + gid + ", pid=" + pid + ", mobile=" + mobile + "]";
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getDays() {
	return days;
}
public void setDays(int days) {
	this.days = days;
}
public int getWages() {
	return wages;
}
public void setWages(int wages) {
	this.wages = wages;
}
public int getGid() {
	return gid;
}
public void setGid(int gid) {
	this.gid = gid;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public Employee(int eid, String ename, String address, int days, int wages, int gid, int pid, long mobile) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.address = address;
	this.days = days;
	this.wages = wages;
	this.gid = gid;
	this.pid = pid;
	this.mobile = mobile;
}
public Employee() {
	super();
}


   
}

