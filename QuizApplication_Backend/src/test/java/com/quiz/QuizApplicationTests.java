package com.quiz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.quiz.service.QuizService;

@SpringBootTest
class QuizApplicationTests {

    @Autowired
    
    private QuizService quizService;

    @Test
    void contextLoads() {
    }

    @Test
    void testCalculateScoreIntegration() {
       
        Map<Long, String> answers = new HashMap<>();
        answers.put(1L, "A");
        answers.put(2L, "B");

        
        int score = quizService.calculateScore(answers);

                assertEquals(true, score >= 0);
    }
}
