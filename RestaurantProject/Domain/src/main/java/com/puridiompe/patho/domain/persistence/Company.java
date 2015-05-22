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
@Table(name = "COMPANY")
public class Company{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "COMPANY_ID", nullable = false, unique = true)
	private Integer companyId;

	@Column(name = "NAME", nullable = false, length = 50)
	private String comapanyName;
	
	@Column(name = "RUC")
	private int comapanyRUC;
	
	@Column(name = "ADDRESS", nullable = false, length = 100)
	private String address;
	
	@Column(name = "TELEPHONE", nullable = false, length = 50)
	private String telephoneNumber;

	
	public Company(){
		
	}


	public Integer getCompanyId() {
		return companyId;
	}


	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}


	public String getComapanyName() {
		return comapanyName;
	}


	public void setComapanyName(String comapanyName) {
		this.comapanyName = comapanyName;
	}


	public int getComapanyRUC() {
		return comapanyRUC;
	}


	public void setComapanyRUC(int comapanyRUC) {
		this.comapanyRUC = comapanyRUC;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getTelephoneNumber() {
		return telephoneNumber;
	}


	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	
	
	

	
}
