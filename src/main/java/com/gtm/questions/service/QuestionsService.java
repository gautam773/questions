package com.gtm.questions.service;

import com.gtm.questions.dao.Questions;
import com.gtm.questions.dao.QuestionsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionsService {

    @Autowired
    QuestionsDAO questionsDAO;

    public List<Questions> getAllQuestions()
    {
        return questionsDAO.findAll();
    }

    public List<Questions> getQuestionsByDomain(String domain) {
        return questionsDAO.findByDomain(domain);
    }

    public Optional<Questions> getQuestionsById(Integer id) {
        return  questionsDAO.findById(id);
    }
}
