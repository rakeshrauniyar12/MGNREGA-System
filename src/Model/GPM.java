package Model;

public class GPM {
    private int gid;
    private String gname;
    private int pid;
	public GPM() {
		
	}
	@Override
	public String toString() {
		return "GPM [gid=" + gid + ", gname=" + gname + ", pid=" + pid + "]";
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
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public GPM(int gid, String gname, int pid) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.pid = pid;
	}
    
}
