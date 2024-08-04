package com.quizapp.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
@Component
public class Controller {
    @Autowired
    Service service;
    @GetMapping("/all")
    public List<Entity> allQuestion()
    {
        return service.getData();
    }

    @GetMapping("/category/{category}")
    public List<Entity> questionBycategory(@PathVariable String category) {
        return service.categoryData(category);
    }

    @PostMapping("/add")
    public String addQuestion(@RequestBody Entity entity)
    {
        return service.addQuestion(entity);
    }

    @PutMapping("/update")
    public String updateQuestion(@RequestBody Entity entity)
    {
        return service.updateQuestion(entity);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteQuestionbyID(@PathVariable Integer id)
    {
        return service.deleteQuestionByID(id);
    }


}

