package com.quizapp.quiz;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Dao extends JpaRepository<Entity , Integer> {

    List<Entity> findByDifficultyLevel(String difficultyLevel);

}
