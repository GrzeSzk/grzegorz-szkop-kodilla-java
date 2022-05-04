package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private ArrayList<Shape> shapeCollector = new ArrayList<>();

    private List<Shape> shapes = new ArrayList<>();

    public void addFiggure (Shape shape){
        shapeCollector.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;

        if (shapeCollector.contains(shape)){
            shapeCollector.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFiggure(int n){
        Shape shape = null;

        if (n >= 0 && n <= shapeCollector.size()){
            shape=shapeCollector.get(n);
        }
        return shape;
    }

    public String showFigures(){
        StringBuilder result = new StringBuilder();

        for (Shape element: shapeCollector) {
            if (shapeCollector.size() - 1 == shapeCollector.indexOf(element)) {
                result.append(element.getShapeName());
            } else {
                result.append(element.getShapeName());
                result.append(" + ");
            }
        }
        return  result.toString();
    }
}
