package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    TODORepository todoRepository;

    @Override
    public void run(String... args) throws Exception {
        ToDo toDo = new ToDo();
        toDo.setTask_Name("Reading");
        toDo.setPriority("High");
        toDo.setDuedate("05/27/2020");
        toDo.setDescription("Reading about the history of America");
        toDo.setIs_completed(false);
        todoRepository.save(toDo);
        ToDo toDo1 = new ToDo();
        toDo1.setTask_Name("Laundry");
        toDo1.setPriority("Low");
        toDo1.setDuedate("05/26/2020");
        toDo1.setDescription("Washing and folding clothes");
        toDo1.setIs_completed(true);
        todoRepository.save(toDo1);

    }
}
