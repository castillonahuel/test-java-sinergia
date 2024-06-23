package com.login.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login.dto.UsuarioReg;
import com.login.service.UsuarioService;

@Controller
@RequestMapping("/registro")
public class RegUsuarioControlador {

	private UsuarioService usuarioService;

	public RegUsuarioControlador(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}
	
	@ModelAttribute("usuario")
	public UsuarioReg devuelveNuevoUsuarioReg() {
		return new UsuarioReg();
	}
	
	@GetMapping
	public String mostrarRegistroForm() {
		return "registro";
	}
	
	@PostMapping
	public String registrarCuentaUsuario(@ModelAttribute("usuario") UsuarioReg registro) {
		usuarioService.save(registro);
		return "redirect:/registro?exito";
	}

}
