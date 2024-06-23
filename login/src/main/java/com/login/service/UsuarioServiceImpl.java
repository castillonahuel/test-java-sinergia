package com.login.service;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.login.dto.UsuarioReg;
import com.login.model.Usuario;
import com.login.repository.UsuarioRepo;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;

	private UsuarioRepo userepo;

	public UsuarioServiceImpl(UsuarioRepo userepo) {
		super();
		this.userepo = userepo;
	}

	@Override
	public Usuario save(UsuarioReg registro) {

		Usuario user = new Usuario( registro.getName(), 
									registro.getLastname(), 
									registro.getMail(), 
									registro.getPass()) ;

		return userepo.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = userepo.findByMail(username);
		
		if(usuario == null) {
			throw new UsernameNotFoundException("Usuario o Password Incorrectos");
		}
		
		return new User(usuario.getMail(), usuario.getPass(), null);
	}

}
