package com.cotec.questionnaireservice.service;

import com.cotec.questionnaireservice.model.Questionnaire;
import com.cotec.questionnaireservice.repository.IQuestionnaireRepo;
import com.cotec.questionnaireservice.service.Interface.IQuestionnaireService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionnaireServiceImp implements IQuestionnaireService {

    @Autowired
    IQuestionnaireRepo questionnaireRepo;

    @Override
    public List<Questionnaire> findAll() {

        return (List<Questionnaire>) questionnaireRepo.findAll();
    }

    @Override
    public Questionnaire findById(String id) {
    	
        return questionnaireRepo
        		.findById(id)
        		.get();
    }

    @Override
    public Questionnaire save(Questionnaire questionnaire) {
    	
        return questionnaireRepo.save(questionnaire);
    }

    @Override
    public Questionnaire update(Questionnaire questionnaire) {
    	
       Questionnaire quest = questionnaireRepo.findById(questionnaire.getQuestionnaireId()).get();
       quest.setDescription(questionnaire.getDescription());
       quest.setName(questionnaire.getName());
       quest.setQuestions(questionnaire.getQuestions());
       
       return quest;
    }

    @Override
    public void delete(String id) {
    	
    	 questionnaireRepo.deleteById(id);
    }
}
