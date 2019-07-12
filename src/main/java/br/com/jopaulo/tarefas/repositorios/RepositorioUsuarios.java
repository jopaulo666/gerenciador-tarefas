package br.com.jopaulo.tarefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jopaulo.tarefas.modelos.Usuario;

public interface RepositorioUsuarios extends JpaRepository<Usuario, Long>{

	Usuario findByEmail(String email);
}
