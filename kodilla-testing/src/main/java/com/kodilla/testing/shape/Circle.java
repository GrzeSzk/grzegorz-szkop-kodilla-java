package com.kodilla.testing.shape;

public class Circle implements Shape{
    private String name;
    private Integer radius;

    public Circle(String name, Integer radius) {
        this.name = name;
        this.radius = radius;
    }

    public Integer getRadius() {
        return radius;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    public Integer getField(){
        return (3*getRadius()*getRadius());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (!name.equals(circle.name)) return false;
        return radius.equals(circle.radius);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + radius.hashCode();
        return result;
    }
}
