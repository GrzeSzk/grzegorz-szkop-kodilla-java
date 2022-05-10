package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("Task to do no 1");
        board.getInProgressList().addTask("Task in progres no 1");
        board.getDoneList().addTask("Done task no 1");

        //Then
        System.out.println("Tasks added to tasks lists: " +
                board.getToDoList().getTasks().get(0) + ", " +
                board.getInProgressList().getTasks().get(0) + ", " +
                board.getDoneList().getTasks().get(0) + ".");
        //potrzebuję pomocy jak wypisac zadania ze wszystkich list jednocześnie, da się jakimś forEach??


    }
}
