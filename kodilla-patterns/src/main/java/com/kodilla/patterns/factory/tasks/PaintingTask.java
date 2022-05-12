package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPaint;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    @Override
    public boolean executeTask() {
        System.out.println("Task: " + getTaskName() + " is in progress.");
        return false;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }
    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
