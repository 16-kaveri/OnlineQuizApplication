package com.quiz.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.model.Question;
import com.quiz.service.QuizService;


@RestController
@RequestMapping("/api/quiz")
@CrossOrigin(origins = "http://localhost:4200") 
public class QuizController {
	
	
	@Autowired
    private QuizService quizService;

    @GetMapping("/questions")
    public List<Question> getQuestions() {
    	  try {
    	        return quizService.getAllQuestions();
    	    } catch (Exception e) {
    	        e.printStackTrace();
    	        return Collections.emptyList();
    	    }
    }

    @PostMapping("/submit")
    public Map<String, Object> submitQuiz(@RequestBody Map<Long, String> answers) {
        int score = quizService.calculateScore(answers);
        Map<String, Object> result = new HashMap<>();
        result.put("score", score);
        return result;
    }

    
    @PostMapping("/add-question")
    public Question addQuestion(@RequestBody Question question) {
        return quizService.saveQuestion(question);
    }

}
