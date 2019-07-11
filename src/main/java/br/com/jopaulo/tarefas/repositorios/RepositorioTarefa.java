package br.com.jopaulo.tarefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jopaulo.tarefas.modelos.Tarefa;

// Spring Data faz insert, update, delete...
public interface RepositorioTarefa extends JpaRepository<Tarefa, Long> {

}
