package com.puridiompe.patho.domain.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author
 *
 */
@Entity
@Table(name = "DIAGNOSIS")
public class Diagnosis{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DIAGNOSIS_ID", nullable = false, unique = true)
	private Integer diagnosisId;

	@Column(name = "NAME", nullable = false, length = 50)
	private String name;
	
	@Column(name = "DESCRIPTION", nullable = false, length = 50)
	private String description;
	
	@Column(name = "REPORT", nullable = false, length = 50)
	private String report;
	
	public Diagnosis(){
		
		
	}

	public Integer getDiagnosisId() {
		return diagnosisId;
	}

	public void setDiagnosisId(Integer diagnosisId) {
		this.diagnosisId = diagnosisId;
	}

	public String getName() {
		return name;
	}

	public void setComapanyName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}
	
	
	
	

}




