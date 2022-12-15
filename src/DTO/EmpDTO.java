package DTO;

public class EmpDTO {
	   private String ename;
	   private String address;
	   private long mobile;
	   private int days;
	   private int wages;
	   private String gname;
	   private String pname;
	   public EmpDTO() {
			super();
		}
	public EmpDTO(String ename, String address, long mobile, int days, int wages, String gname, String pname) {
		super();
		this.ename = ename;
		this.address = address;
		this.mobile = mobile;
		this.days = days;
		this.wages = wages;
		this.gname = gname;
		this.pname = pname;
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
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
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "EmpDTO [ename=" + ename + ", address=" + address + ", mobile=" + mobile + ", days=" + days + ", wages="
				+ wages + ", gname=" + gname + ", pname=" + pname + "]";
	}
	   
}
