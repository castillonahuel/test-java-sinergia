package com.login.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.login.dto.UsuarioReg;
import com.login.model.Usuario;

public interface UsuarioService extends UserDetailsService{

	public Usuario save(UsuarioReg registro);
}