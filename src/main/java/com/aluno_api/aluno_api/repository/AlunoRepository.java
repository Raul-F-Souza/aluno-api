package com.aluno_api.aluno_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aluno_api.aluno_api.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
