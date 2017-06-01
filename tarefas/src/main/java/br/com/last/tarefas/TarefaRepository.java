package br.com.last.tarefas;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer>{

	List<Tarefa> findByDescricaoStartsWith(String tarefa);
	
}
