package com.green.user.vo;

public class UserVo {

	private String username;
	private String userid;
	private String userpw;
	
	public UserVo() {}
	public UserVo(String username, String userid, String userpw) {
		this.username = username;
		this.userid = userid;
		this.userpw = userpw;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	@Override
	public String toString() {
		return "UserVo [username=" + username + ", userid=" + userid + ", userpw=" + userpw + "]";
	}
	
	
	
	
	
}
