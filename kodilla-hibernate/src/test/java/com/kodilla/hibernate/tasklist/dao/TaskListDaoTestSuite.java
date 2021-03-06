//package com.kodilla.hibernate.tasklist.dao;
//
//import com.kodilla.hibernate.tasklist.TaskList;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest
//public class TaskListDaoTestSuite {
//
//    private static final String DESCRIPTION = "Example task";
//
//    @Autowired
//    private TaskListDao1 taskListDao1;
//
//    @Test
//    void testFindByListName() {
//        //Given
//        TaskList taskList = new TaskList("First list", DESCRIPTION);
//        taskListDao1.save(taskList);
//        String listName = taskList.getListName();
//
//        //When
//        List<TaskList> readTasks = taskListDao1.findByListName(listName);
//
//        //Then
//        assertEquals(1, readTasks.size());
//
//        //CleanUp
//        int id = readTasks.get(0).getId();
//        taskListDao1.deleteById(id);
//    }
//
//    @Test
//    void testFindByListName1() {
//        //Given
//        TaskList taskList = new TaskList("First list", DESCRIPTION);
//        taskListDao1.save(taskList);
//        String listName = taskList.getListName();
//
//        //When
//        var readTasks = new ArrayList<TaskList>((Collection<? extends TaskList>) taskListDao1.findAll());
//
//        //Then
//        assertEquals(1, readTasks.size());
//
//        //CleanUp
//        int id = readTasks.get(0).getId();
//        taskListDao1.deleteById(id);
//    }
//
//
//}
