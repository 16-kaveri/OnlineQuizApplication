package com.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.model.Question;

public interface QuestionRepo extends JpaRepository<Question, Long>{

}
