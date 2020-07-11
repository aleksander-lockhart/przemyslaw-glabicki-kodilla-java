package com.kodilla.testing.shape;


public class ShapeTriangle implements Shape{
    private String shapeName;
    private double triangleBaseLength;
    private double triangleHeight;

    public ShapeTriangle(String shapeName, double triangleBaseLength, double triangleHeight) {
        this.shapeName = shapeName;
        this.triangleBaseLength = triangleBaseLength;
        this.triangleHeight = triangleHeight;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField(){
        return 0.5 * (triangleBaseLength + triangleHeight);
    }
}
