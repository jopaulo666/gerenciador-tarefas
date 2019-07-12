package br.com.jopaulo.tarefas.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.jopaulo.tarefas.modelos.Usuario;
import br.com.jopaulo.tarefas.repositorios.RepositorioUsuarios;

@Service
public class ServicoUsuario {

	@Autowired
	private RepositorioUsuarios repositorioUsuarios;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public Usuario encontrarPorEmail(String email) {
		return repositorioUsuarios.findByEmail(email);
	}
	
	public void salvar(Usuario usuario) {
		usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
		repositorioUsuarios.save(usuario);
	}
}
