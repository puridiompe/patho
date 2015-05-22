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
@Table(name = "USER")
public class User{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID", nullable = false, unique = true)
	private Integer userId;

	@Column(name = "NAME", nullable = false, length = 50)
	private String name;
	
	@Column(name = "AGE")
	private int age;
	
	@Column(name = "SEX", nullable = false, length = 50)
	private String sex;
	
	@Column(name = "DNI", nullable = false, length = 50)
	private String dni;
	
	@Column(name = "ADDRESS", nullable = false, length = 100)
	private String address;
	
	@Column(name = "TELEPHONE", nullable = false, length = 50)
	private String telephoneNumber;
	
	@Column(name = "MOVIL_NUMBER", nullable = false, length = 50)
	private String movilNumber;
	
	@Column(name = "TYPE", nullable = false, length = 50)
	private String type;
	
	@Column(name = "EMAIL", nullable = false, length = 50)
	private String email;
	
	@Column(name = "PASSWORD", nullable = false, length = 50)
	private String password;
	
	@Column(name = "SIGNATURE", nullable = false, length = 50)
	private String signature;
	
	
	public User(){
		
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
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


	public String getMovilNumber() {
		return movilNumber;
	}


	public void setMovilNumber(String movilNumber) {
		this.movilNumber = movilNumber;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getSignature() {
		return signature;
	}


	public void setSignature(String signature) {
		this.signature = signature;
	}
	
}
