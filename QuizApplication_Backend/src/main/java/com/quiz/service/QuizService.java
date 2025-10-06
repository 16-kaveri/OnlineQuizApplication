package com.quiz.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.model.Question;
import com.quiz.repository.QuestionRepo;


@Service
public class QuizService {

	
	 private final QuestionRepo questionRepository;

	    @Autowired
	    public QuizService(QuestionRepo questionRepository) {
	        this.questionRepository = questionRepository;
	    }

	   public List<Question> getAllQuestions() {
		    return questionRepository.findAll(); 
		}

	   public int calculateScore(Map<Long, String> answers) {
	        int score = 0;
	        for (Map.Entry<Long, String> entry : answers.entrySet()) {
	            Optional<Question> q = questionRepository.findById(entry.getKey());
	            if (q.isPresent() && q.get().getCorrectOption().equalsIgnoreCase(entry.getValue())) {
	                score++;
	            }
	        }
	        return score;
	    }


	    
	    public Question saveQuestion(Question question) {
	        return questionRepository.save(question);
	    }
}
