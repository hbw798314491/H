package com.qingmu.hibernate.entities.result;

import com.qingmu.hibernate.entities.student.StudentPojo;
public class ReportPojo {

	private Integer oid;
	private Double reportChinese;
	private Double reportMathematics;
	private Double reportLanguages;
	private Double reportGeneral;
	
	private StudentPojo student;
	

	
	
	public Integer getOid() {
		return oid;
	}


	public void setOid(Integer oid) {
		this.oid = oid;
	}


	public Double getReportChinese() {
		return reportChinese;
	}


	public void setReportChinese(Double reportChinese) {
		this.reportChinese = reportChinese;
	}


	public Double getReportMathematics() {
		return reportMathematics;
	}


	public void setReportMathematics(Double reportMathematics) {
		this.reportMathematics = reportMathematics;
	}



	public Double getReportLanguages() {
		return reportLanguages;
	}


	public void setReportLanguages(Double reportLanguages) {
		this.reportLanguages = reportLanguages;
	}


	public Double getReportGeneral() {
		return reportGeneral;
	}


	public void setReportGeneral(Double reportGeneral) {
		this.reportGeneral = reportGeneral;
	}


	public StudentPojo getStudent() {
		return student;
	}


	public void setStudent(StudentPojo student) {
		this.student = student;
	}

	
	

	public ReportPojo(Double reportChinese, Double reportMathematics, Double reportLanguages, Double reportGeneral,
			StudentPojo student) {
		super();
		this.reportChinese = reportChinese;
		this.reportMathematics = reportMathematics;
		this.reportLanguages = reportLanguages;
		this.reportGeneral = reportGeneral;
		this.student = student;
	}



	@Override
	public String toString() {
		return "ReportPojo [oid=" + oid + ", reportChinese=" + reportChinese + ", reportMathematics="
				+ reportMathematics + ", reportLanguages=" + reportLanguages + ", reportGeneral=" + reportGeneral
				+ ", student=" + student + "]";
	}


	public ReportPojo() {
		
		
		
		
		
	}


	
	
}

	
