package com.natalia.listadetarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natalia.listadetarefas.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}