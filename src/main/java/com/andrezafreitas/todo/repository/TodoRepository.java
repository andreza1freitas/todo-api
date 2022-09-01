package com.andrezafreitas.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrezafreitas.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
