package com.hamoksha.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamoksha.quiz.domain.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{

}
