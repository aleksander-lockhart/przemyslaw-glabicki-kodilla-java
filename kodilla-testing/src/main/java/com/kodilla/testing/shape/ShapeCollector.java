package com.kodilla.testing.shape;
import java.util.*;


public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeShape(Shape shape) {
        boolean ifRemoved = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            ifRemoved = true;
        }
        return ifRemoved;
    }

    public Shape getFigure(int n) {
    Shape obtainedFigure = null;

    if (n >= 0 && n < shapes.size()) {
        obtainedFigure = shapes.get(n);
    }
    return obtainedFigure;
    }

     public Shape showFigures() {
     for (Shape listShapes : shapes) {
         System.out.println(listShapes);
     }
     return null;
     }

    public List<Shape> getShapes() {
        return shapes;
    }
}
