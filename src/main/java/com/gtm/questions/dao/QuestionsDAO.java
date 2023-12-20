package com.gtm.questions.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionsDAO extends JpaRepository<Questions,Integer> {
    List<Questions> findByDomain(String domain);

}
