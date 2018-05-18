package com.qingmu.hibernate.entities.student;

import java.util.Date;

import com.qingmu.hibernate.entities.data.InformationPojo;
import com.qingmu.hibernate.entities.result.ReportPojo;

public class StudentPojo {
	
	
	private Integer oid;
	private long User;
	private String studentName;
	private String studentPassword;
	private Integer studentClass;
	private Date studentDate;
	
	private ReportPojo report;
	private InformationPojo information;

	
	



	public InformationPojo getInformation() {
		return information;
	}


	public void setInformation(InformationPojo information) {
		this.information = information;
	}


	public Integer getOid() {
		return oid;
	}


	public void setOid(Integer oid) {
		this.oid = oid;
	}


	public long getUser() {
		return User;
	}


	public void setUser(long user) {
		User = user;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentPassword() {
		return studentPassword;
	}


	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}


	public Integer getStudentClass() {
		return studentClass;
	}


	public void setStudentClass(Integer studentClass) {
		this.studentClass = studentClass;
	}


	public Date getStudentDate() {
		return studentDate;
	}


	public void setStudentDate(Date studentDate) {
		this.studentDate = studentDate;
	}


	public ReportPojo getReport() {
		return report;
	}


	public void setReport(ReportPojo report) {
		this.report = report;
	}


	
	

	@Override
	public String toString() {
		return "StudentPojo [oid=" + oid + ", User=" + User + ", studentName=" + studentName + ", studentPassword="
				+ studentPassword + ", studentClass=" + studentClass + ", studentDate=" + studentDate + ", report="
				+ report + "]";
	}


	public StudentPojo(long user, String studentName, String studentPassword, Integer studentClass, Date studentDate) {
		super();
		User = user;
		this.studentName = studentName;
		this.studentPassword = studentPassword;
		this.studentClass = studentClass;
		this.studentDate = studentDate;
	}


	public StudentPojo(){
		
	}

}
