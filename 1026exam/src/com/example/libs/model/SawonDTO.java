package com.example.libs.model;

public class SawonDTO {
	  private String sabun; // 사번
	  private int hobong;  //호봉
	  private int ntime; // 야근시간
	  private int family; // 부양 가족 수
	  
	  private String buseo; // 부서
	  private int gibon; // 기본급
	  private int jikmu; // 직무급 
	  private int nsudang; //야근수당
	  private int fsudang; // 가족수당
	  private int total; // 총 지급액
	  private int so; //소득세
	  private int sil; // 실수령액 
	  
	public SawonDTO(String sabun, int hobong, int ntime, int family) {
		super();
		this.sabun = sabun;
		this.hobong = hobong;
		this.ntime = ntime;
		this.family = family;
	}	
	
	public SawonDTO(String sabun, String buseo, int gibon, int jikmu, int nsudang, int fsudang, int total, int so,
			int sil) {
		super();
		this.sabun = sabun;
		this.buseo = buseo;
		this.gibon = gibon;
		this.jikmu = jikmu;
		this.nsudang = nsudang;
		this.fsudang = fsudang;
		this.total = total;
		this.so = so;
		this.sil = sil;
	}



	public String getSabun() {
		return sabun;
	}
	public void setSabun(String sabun) {
		this.sabun = sabun;
	}
	public int getHobong() {
		return hobong;
	}
	public void setHobong(int hobong) {
		this.hobong = hobong;
	}
	public int getNtime() {
		return ntime;
	}
	public void setNtime(int ntime) {
		this.ntime = ntime;
	}
	public int getFamily() {
		return family;
	}
	public void setFamily(int family) {
		this.family = family;
	}
	public String getBuseo() {
		return buseo;
	}
	public void setBuseo(String buseo) {
		this.buseo = buseo;
	}
	public int getGibon() {
		return gibon;
	}
	public void setGibon(int gibon) {
		this.gibon = gibon;
	}
	public int getJikmu() {
		return jikmu;
	}
	public void setJikmu(int jikmu) {
		this.jikmu = jikmu;
	}
	public int getNsudang() {
		return nsudang;
	}
	public void setNsudang(int nsudang) {
		this.nsudang = nsudang;
	}
	public int getFsudang() {
		return fsudang;
	}
	public void setFsudang(int fsudang) {
		this.fsudang = fsudang;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getSo() {
		return so;
	}
	public void setSo(int so) {
		this.so = so;
	}
	public int getSil() {
		return sil;
	}
	public void setSil(int sil) {
		this.sil = sil;
	}
	  
	  
	  
}
