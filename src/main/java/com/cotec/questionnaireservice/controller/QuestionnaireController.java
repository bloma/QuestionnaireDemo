package com.cotec.questionnaireservice.controller;

import com.cotec.questionnaireservice.model.Questionnaire;
import com.cotec.questionnaireservice.service.Interface.IQuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("questionnaire")
public class QuestionnaireController {

    @Autowired
    IQuestionnaireService questionnaireService;

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<Questionnaire> findQuestionnaires() {
        return questionnaireService.findAll();
    }

    @PostMapping("/addquestionnaire")
    @ResponseStatus(HttpStatus.CREATED)
    public Questionnaire addQuestionnaire(@RequestBody Questionnaire questionnaire){
    	String name = questionnaire.getName();
    	System.out.println(name);
        return  questionnaireService.save(questionnaire);
    }
    
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Questionnaire GetQuestionnaireById(@RequestBody String id) {
    	System.out.println(id);
        return  questionnaireService.findById(id);
    }
}
