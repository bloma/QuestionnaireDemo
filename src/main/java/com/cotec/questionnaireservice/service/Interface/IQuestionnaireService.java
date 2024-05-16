package com.cotec.questionnaireservice.service.Interface;

import com.cotec.questionnaireservice.model.Question;
import com.cotec.questionnaireservice.model.Questionnaire;

import java.util.List;

public interface IQuestionnaireService {

        List<Questionnaire> findAll();
        Questionnaire findById(String id);
        Questionnaire save(Questionnaire questionnaire);
        Questionnaire update(Questionnaire questionnaire);
        void delete(String id);
}
