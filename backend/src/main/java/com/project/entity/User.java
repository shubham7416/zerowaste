package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class User {
	
	@Id
	private String email;
	private String password;
	private String name;
	private String city;
	private String phone;
	private String securityQues;
	private String securityAns;
	private boolean isAdmin=false;
	

	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public String getPhone() {
		return phone;
	}
	public String getSecurityQues() {
		return securityQues;
	}
	public String getSecurityAns() {
		return securityAns;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setSecurityQues(String securityQues) {
		this.securityQues = securityQues;
	}
	public void setSecurityAns(String securityAns) {
		this.securityAns = securityAns;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
	
	public User() {
		super();
	}
	public User(String email, String password, String name, String city, String phone, String securityQues,
			String securityAns, boolean isAdmin) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.city = city;
		this.phone = phone;
		this.securityQues = securityQues;
		this.securityAns = securityAns;
		this.isAdmin = isAdmin;
	}
	
	
	
	
}
