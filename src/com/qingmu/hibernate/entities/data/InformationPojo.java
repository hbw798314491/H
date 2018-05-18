package com.qingmu.hibernate.entities.data;

import com.qingmu.hibernate.entities.StudentPojo;

public class InformationPojo {

	private Integer oid;
	private String informationSex;
	private String informationTel;
	private String informationHobby;
	private String informationEthnic;
	
	private StudentPojo student;
	
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getInformationSex() {
		return informationSex;
	}
	public void setInformationSex(String informationSex) {
		this.informationSex = informationSex;
	}
	public String getInformationTel() {
		return informationTel;
	}
	public void setInformationTel(String informationTel) {
		this.informationTel = informationTel;
	}
	public String getInformationHobby() {
		return informationHobby;
	}
	public void setInformationHobby(String informationHobby) {
		this.informationHobby = informationHobby;
	}
	public String getInformationEthnic() {
		return informationEthnic;
	}
	public void setInformationEthnic(String informationEthnic) {
		this.informationEthnic = informationEthnic;
	}
	public StudentPojo getStudent() {
		return student;
	}
	public void setStudent(StudentPojo student) {
		this.student = student;
	}
	
	public InformationPojo(String informationSex, String informationTel, String informationHobby,
			String informationEthnic, StudentPojo student) {
		super();
		this.informationSex = informationSex;
		this.informationTel = informationTel;
		this.informationHobby = informationHobby;
		this.informationEthnic = informationEthnic;
		this.student = student;
	}
	
	@Override
	public String toString() {
		return "InformationPojo [oid=" + oid + ", informationSex=" + informationSex + ", informationTel="
				+ informationTel + ", informationHobby=" + informationHobby + ", informationEthnic=" + informationEthnic
				+ ", student=" + student + "]";
	}
	
	
	
	
}
