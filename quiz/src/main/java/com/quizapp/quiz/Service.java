package com.quizapp.quiz;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Dao dao;

    public String addQuestion(Entity entity) {
        dao.save(entity);
        return "success";
    }


    public List<Entity> getData() {
        return dao.findAll();



    }

    public List<Entity> categoryData(String category) {
        return dao.findByDifficultyLevel(category);
    }

    public String updateQuestion(Entity entity) {
        dao.save(entity);
        return "200";
    }


    public String deleteQuestionByID(Integer id) {
        dao.deleteById(id);
        return "201";
    }
}
