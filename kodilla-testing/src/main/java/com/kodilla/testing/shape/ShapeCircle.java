package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;

public class ShapeCircle implements Shape {

    private String getShape;
    private double circleRadius;


    public ShapeCircle(String getShape, double circleRadius) {
        this.getShape = getShape;
        this.circleRadius = circleRadius;
    }

    @Override
    public String getShapeName() {
        return getShape;
    }

    @Override
    public double getField() {
        return 3.14 * (circleRadius * circleRadius);
    }

}
