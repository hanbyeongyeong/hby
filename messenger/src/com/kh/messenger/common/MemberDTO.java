package com.kh.messenger.common;

import java.io.Serializable;

public class MemberDTO implements Serializable {	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1717557936543454548L;
	
	private String id;
	private String pw;
	private String tel;
	private String nickname;
	private String gender;
	private String region;
	private String birth;
	
	public MemberDTO() {
		
	}
	public MemberDTO(String id, String pw, String tel, String nickname, String gender, String region, String birth) {
		super();
		this.id = id;
		this.pw = pw;
		this.tel = tel;
		this.nickname = nickname;
		this.gender = gender;
		this.region = region;
		this.birth = birth;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [id="+id+", pw="+pw+", tel="+tel+", nickname="+nickname+", gender="+gender+
			", region="+region+", birth="+birth+"]";
	}
	
}
