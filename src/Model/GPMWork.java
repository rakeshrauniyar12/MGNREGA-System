package Model;

import java.sql.Date;

public class GPMWork {
   private int gid;
   private String gname;
   private Date alot_date;
   private int pid;
public GPMWork() {
	super();
}
public GPMWork(int gid, String gname, Date alot_date, int pid) {
	super();
	this.gid = gid;
	this.gname = gname;
	this.alot_date = alot_date;
	this.pid = pid;
}
public int getGid() {
	return gid;
}
public void setGid(int gid) {
	this.gid = gid;
}
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public Date getAlot_date() {
	return alot_date;
}
public void setAlot_date(Date alot_date) {
	this.alot_date = alot_date;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
@Override
public String toString() {
	return "GMPWork [gid=" + gid + ", gname=" + gname + ", alot_date=" + alot_date + ", pid=" + pid + "]";
}
   
}
