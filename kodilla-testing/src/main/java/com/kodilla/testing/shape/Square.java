package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name;
    private Integer edgeLength;

    public Square(String name, Integer edgeLength) {
        this.name = name;
        this.edgeLength = edgeLength;
    }

    public String getShapeName() {
        return name;
    }

    public Integer getEdgeLength() {
        return edgeLength;
    }
    public Integer getField(){
        return (getEdgeLength()*getEdgeLength());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (!name.equals(square.name)) return false;
        return edgeLength.equals(square.edgeLength);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + edgeLength.hashCode();
        return result;
    }
}
