package com.cotec.questionnaireservice.repository;

import com.cotec.questionnaireservice.model.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IQuestionRepo extends CrudRepository<Question, String> {
}
