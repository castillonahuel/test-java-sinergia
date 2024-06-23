package com.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.model.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Long>{
	
	public Usuario findByMail(String mail);

}
