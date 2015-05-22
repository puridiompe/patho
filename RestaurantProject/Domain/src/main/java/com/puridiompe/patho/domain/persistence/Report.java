package com.puridiompe.patho.domain.persistence;

import java.util.Date;

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
@Table(name = "REPORT")
public class Report{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "REPORT_ID", nullable = false, unique = true)
	private Integer reportId;

	@Column(name = "REGISTER_NUMBER", nullable = false, length = 50)
	private String registerNumber;
	
	@Column(name = "REVISION_REGISTER_NUMBER", nullable = false, length = 50)
	private String revisionRegisterNumber;
	
	@Column(name = "USER_ID", nullable = false, length = 50)
	private String userId;
	
	@Column(name = "PROCEDENCE", nullable = false, length = 100)
	private String procedence;
	
	@Column(name = "SAMPLE_DESCRIPTION", nullable = false, length = 50)
	private String sampleDescription;
	
	@Column(name = "PRESUMPTIVE_DIAGNOSIS", nullable = false, length = 50)
	private String presumptiveDiagnosis;
	
	@Column(name = "RECEIPT_DATE", nullable = false, length = 50)
	private Date receiptDate;
	
	@Column(name = "DELIVERY_DATE", nullable = false, length = 50)
	private Date deliveryDate;
	
	@Column(name = "PROBABLY_DATE", nullable = false, length = 50)
	private Date probablyDate;
	
	@Column(name = "NAME", nullable = false, length = 50)
	private String name;
	
	@Column(name = "DOCTOR", nullable = false, length = 50)
	private String doctor;
	
	@Column(name = "FINAL_DIAGNOSIS", nullable = false, length = 50)
	private String finalDiagnosis;
	
	@Column(name = "COMPANY_ID", nullable = false, length = 50)
	private String companyId;
	
	@Column(name = "STATUS", nullable = false, length = 50)
	private String status;
	
	@Column(name = "ANALYSIS_COST", nullable = false, length = 50)
	private String analysisCost;
	
	@Column(name = "ACCOUNTING_PAYMENT", nullable = false, length = 50)
	private String accountingPayment;
	
	@Column(name = "CANCELLATION_DATE", nullable = false, length = 50)
	private Date cancellationDate;
	
	
	public Report(){
		
	}


}

