package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPINGTASK = "SHOPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPINGTASK:
                return new ShoppingTask("Shopping", "Pants", 2);
            case PAINTINGTASK:
                return new PaintingTask("Painting", "Blue", "Car");
            case DRIVINGTASK:
                return new DrivingTask("Drive", "To the city", "By bike");
            default:
                return null;
        }
    }

}
