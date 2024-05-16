package com.cotec.questionnaireservice.repository;

import com.cotec.questionnaireservice.model.Questionnaire;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IQuestionnaireRepo extends MongoRepository<Questionnaire, String> {
}
