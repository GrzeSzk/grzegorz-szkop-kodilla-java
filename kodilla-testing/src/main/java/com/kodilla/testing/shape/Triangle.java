package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private String name;
    private Integer edgeLengthA;
    private Integer edgeLengthB;

    public Triangle(String name, Integer edgeLengthA, Integer edgeLengthB) {
        this.name = name;
        this.edgeLengthA = edgeLengthA;
        this.edgeLengthB = edgeLengthB;
    }

    public String getShapeName() {
        return name;
    }

    public Integer getEdgeLengthA() {
        return edgeLengthA;
    }

    public Integer getEdgeLengthB() {
        return edgeLengthB;
    }
    public Integer getField(){
        return ((getEdgeLengthA() * getEdgeLengthB())/2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (!name.equals(triangle.name)) return false;
        if (!edgeLengthA.equals(triangle.edgeLengthA)) return false;
        return edgeLengthB.equals(triangle.edgeLengthB);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + edgeLengthA.hashCode();
        result = 31 * result + edgeLengthB.hashCode();
        return result;
    }
}
