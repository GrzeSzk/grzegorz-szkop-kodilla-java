package com.kodilla.patterns.factory.task;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPINGTASK);
        //Then
        shoppingTask.executeTask();
        assertEquals("Shopping", shoppingTask.getTaskName());
        assertEquals(true, shoppingTask.isTaskExecuted());
    }
    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        paintingTask.executeTask();
        assertEquals("Painting", paintingTask.getTaskName());
        assertEquals(true, paintingTask.isTaskExecuted());
    }
    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        drivingTask.executeTask();
        assertEquals("Drive", drivingTask.getTaskName());
        assertEquals(true, drivingTask.isTaskExecuted());
    }
}
