package com.project.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
/* @ToString */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Agent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String password;
	private String city;
	private long phone;
	private boolean is_free=true;
	@JsonIgnore
	@OneToMany(mappedBy = "agentid", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Request> request;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getCity() {
		return city;
	}
	public long getPhone() {
		return phone;
	}
	public boolean isIs_free() {
		return is_free;
	}
	public List<Request> getRequest() {
		return request;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public void setIs_free(boolean is_free) {
		this.is_free = is_free;
	}
	public void setRequest(List<Request> request) {
		this.request = request;
	}
	
	
}
