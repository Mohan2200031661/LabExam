package com.klef.jfsd.exam.AutoWiring;

public class Course {
	
	private int cid;
	private String cname;
	private float credits;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public float getCredits() {
		return credits;
	}
	public void setCredits(float credits) {
		this.credits = credits;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", credits=" + credits + "]";
	}

}
