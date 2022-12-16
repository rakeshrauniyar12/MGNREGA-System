package Model;

public class GPM {
   private int gid;
   private String gname;
   private String gemail;
   private String gpassword;
@Override
public String toString() {
	return "GPM [gid=" + gid + ", gname=" + gname + ", gemail=" + gemail + ", gpassword=" + gpassword + "]";
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
public String getGemail() {
	return gemail;
}
public void setGemail(String gemail) {
	this.gemail = gemail;
}
public String getGpassword() {
	return gpassword;
}
public void setGpassword(String gpassword) {
	this.gpassword = gpassword;
}
public GPM(int gid, String gname, String gemail, String gpassword) {
	super();
	this.gid = gid;
	this.gname = gname;
	this.gemail = gemail;
	this.gpassword = gpassword;
}
public GPM() {
	super();
}
    
}
