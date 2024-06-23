package com.login.dto;

public class UsuarioReg {

	private long id;
	private String name;
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

	public UsuarioReg(long id, String name, String lastname, String mail, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.mail = mail;
		this.pass = pass;
	}

	public UsuarioReg(String name, String lastname, String mail, String pass) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.mail = mail;
		this.pass = pass;
	}

	public UsuarioReg(String mail) {
		super();
		this.mail = mail;
	}

	public UsuarioReg() {
		super();
	}

}
