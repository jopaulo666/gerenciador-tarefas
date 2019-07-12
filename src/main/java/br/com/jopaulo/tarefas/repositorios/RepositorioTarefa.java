package br.com.jopaulo.tarefas.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.jopaulo.tarefas.modelos.Tarefa;

// Spring Data faz insert, update, delete...
public interface RepositorioTarefa extends JpaRepository<Tarefa, Long> {
	
	@Query("SELECT t FROM Tarefa t WHERE t.usuario.email = :emailUsuario")
	List<Tarefa> carregarTarefasUsuario(@Param("emailUsuario") String email);

}
