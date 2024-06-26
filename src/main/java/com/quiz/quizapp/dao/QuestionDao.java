package com.quiz.quizapp.dao;

import com.quiz.quizapp.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionDao extends JpaRepository<Question, Integer> {
    List<Question> findByCategory(String category);
}
