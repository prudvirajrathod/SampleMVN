package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "feuser")
public class Tourist {
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private String feuserid;
	private String firstname;
	private String lastname;
	@NonNull
	private String email;
	@NonNull
	private String password;
	@NonNull
	private String phone;
	@NonNull
	private String cell;
	private Integer defaultschoolid;
	@NonNull
	private String wid;
	private Integer textable;
	public String getFeuserid() {
		return feuserid;
	}
	public void setFeuserid(String feuserid) {
		this.feuserid = feuserid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCell() {
		return cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}
	public Integer getDefaultschoolid() {
		return defaultschoolid;
	}
	public void setDefaultschoolid(Integer defaultschoolid) {
		this.defaultschoolid = defaultschoolid;
	}
	public String getWid() {
		return wid;
	}
	public void setWid(String wid) {
		this.wid = wid;
	}
	public Integer getTextable() {
		return textable;
	}
	public void setTextable(Integer textable) {
		this.textable = textable;
	}

	
}
