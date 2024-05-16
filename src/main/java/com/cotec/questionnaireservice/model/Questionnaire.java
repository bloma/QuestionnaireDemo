package com.cotec.questionnaireservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
@AllArgsConstructor
@NoArgsConstructor
public class Questionnaire {
    @Id
    private String QuestionnaireId;
    private String Name;
    private String Description;
    private boolean IsActive;
    private Date DateCreated;
    private List<Question> Questions;
    
    
	public String getQuestionnaireId() {
		return QuestionnaireId;
	}
	
	public void setQuestionnaireId(String questionnaireId) {
		this.QuestionnaireId = questionnaireId;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	
	public String getDescription() {
		return Description;
	}
	
	public void setDescription(String description) {
		this.Description = description;
	}
	
	public List<Question> getQuestions() {
		return Questions;
	}
	
	public void setQuestions(List<Question> questions) {
		Questions = questions;
	}
	
	public boolean isIsActive() {
		return IsActive;
	}
	
	public void setIsActive(boolean isActive) {
		IsActive = isActive;
	}

	public Date getDateCreated() {
		return DateCreated;
	}

	@SuppressWarnings("static-access")
	public void setDateCreated() {
		DateCreated = new Date().from(null);
	}
    
}
