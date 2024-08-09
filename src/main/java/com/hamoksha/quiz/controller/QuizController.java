package com.hamoksha.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hamoksha.quiz.domain.Question;
import com.hamoksha.quiz.repository.QuestionRepository;

@Controller
public class QuizController {

	@Autowired
	private QuestionRepository repo;
	
	@GetMapping("/questions")
	@ResponseBody
	List<Question> listQuestions(){
		return repo.findAll();
	}

}
