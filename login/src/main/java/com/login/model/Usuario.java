package com.login.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "nombreusuario", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "lastname")
	private String lastname;

	private String mail;
	private String pass;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Usuario(long id, String name, String lastname, String mail, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.mail = mail;
		this.pass = pass;
	}

	public Usuario(String name, String lastname, String mail, String pass) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.mail = mail;
		this.pass = pass;
	}

	public Usuario() {
		super();
	}
	
	

}
