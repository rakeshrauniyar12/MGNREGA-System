package DTO;

public class EmpDTO {
	private int eid;
	   private String ename;
	   private int gid;
	   private int days;
	   private int wages;
	public EmpDTO() {
		super();
	}
	public EmpDTO(String ename, int gid, int days, int wages,int eid) {
		super();
		this.eid=eid;
		this.ename = ename;
		this.gid = gid;
		this.days = days;
		this.wages = wages;
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
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
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
	@Override
	public String toString() {
		return "EmpDTO [ename=" + ename +", eid="+ eid +", gid=" + gid + ", days=" + days + ", wages=" + wages + "]";
	}
	   
	   
}
