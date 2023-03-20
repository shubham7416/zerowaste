package com.project.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Request {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int reqid;
	private String name;
	private String email;
	private String address;
	private String city;
	private int payment;
	private String ewasteQty;
	private int quantity;

	private boolean status =false;
	private boolean imageuploadstatus=false;
	@ManyToOne
	@JoinColumn(name = "agent_id")
	private Agent agentid;
	@JsonIgnore //need to ignore during marshalling
	@OneToMany(mappedBy = "request_id", cascade = CascadeType.ALL)
     private List<FileDB> images;
	public int getReqid() {
		return reqid;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public int getPayment() {
		return payment;
	}
	public String getEwasteQty() {
		return ewasteQty;
	}
	public int getQuantity() {
		return quantity;
	}
	public boolean isStatus() {
		return status;
	}
	public boolean isImageuploadstatus() {
		return imageuploadstatus;
	}
	public Agent getAgentid() {
		return agentid;
	}
	public List<FileDB> getImages() {
		return images;
	}
	public void setReqid(int reqid) {
		this.reqid = reqid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public void setEwasteQty(String ewasteQty) {
		this.ewasteQty = ewasteQty;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public void setImageuploadstatus(boolean imageuploadstatus) {
		this.imageuploadstatus = imageuploadstatus;
	}
	public void setAgentid(Agent agentid) {
		this.agentid = agentid;
	}
	public void setImages(List<FileDB> images) {
		this.images = images;
	}
	
}
