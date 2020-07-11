package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;

public class ShapeSquare implements Shape {

    private String shapeName;
    private double squareWallLength;

    public ShapeSquare(String shapeName, double squareWallLength) {
        this.shapeName = shapeName;
        this.squareWallLength = squareWallLength;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField(){
        return squareWallLength * squareWallLength;
    }

}
