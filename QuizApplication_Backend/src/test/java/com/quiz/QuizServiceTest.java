package com.quiz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.quiz.model.Question;
import com.quiz.repository.QuestionRepo;
import com.quiz.service.QuizService;

public class QuizServiceTest {

	
	 private QuizService quizService;
	    private QuestionRepo questionRepository;

	    @BeforeEach
	    void setUp() {
	        questionRepository = mock(QuestionRepo.class);
	        quizService = new QuizService(questionRepository);
	    }

	    @Test
	    void testCalculateScore() {
	        Question q1 = new Question();
	        q1.setId(1L);
	        q1.setCorrectOption("A");

	        
	        when(questionRepository.findById(1L)).thenReturn(Optional.of(q1));

	        
	        Map<Long, String> answers = new HashMap<>();
	        answers.put(1L, "A");

	      
	        int score = quizService.calculateScore(answers);

	     
	        assertEquals(1, score);
	    }
}
