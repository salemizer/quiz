package com.hamoksha.quiz.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity(name= "question")
public class Question {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "question_id")
	private Long questionId;
	
	@Column(name= "title")
	private String title;
	
	@Column(name= "text")
	private String text;
	
	@OneToMany(mappedBy = "question",fetch = FetchType.LAZY)
	private List<Answer> answers;

	public Question() {
		// TODO Auto-generated constructor stub
	}

	
	public Long getQuestionId() {
		return questionId;
	}


	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}


	public List<Answer> getAnswers() {
		return answers;
	}


	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	
}
