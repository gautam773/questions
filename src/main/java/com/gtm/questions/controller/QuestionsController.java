package com.gtm.questions.controller;

import com.gtm.questions.dao.Questions;
import com.gtm.questions.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("question")
public class QuestionsController
{
    @Autowired
    QuestionsService questionsService;

    @GetMapping("getAllQuestions")
    public List<Questions> getAllQuestions()
    {
        return questionsService.getAllQuestions();
    }

    @GetMapping(value = "/getQustions/{domain}")
    public List<Questions> getQuestionsByDomain(@PathVariable String domain)
    {
        return questionsService.getQuestionsByDomain(domain);
    }

    @GetMapping(value="/getQuestionsById/{id}")
    public Optional<Questions> getQuestionsById(@PathVariable Integer id)
    {
        return questionsService.getQuestionsById(id);
    }
}
