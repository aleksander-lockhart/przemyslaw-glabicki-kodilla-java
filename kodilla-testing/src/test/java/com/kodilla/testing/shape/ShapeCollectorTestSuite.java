package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Test start");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("End of tests");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape square_1 = new ShapeSquare("Square_1", 12);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addShape(square_1);
        //Then
        Assert.assertEquals(1, shapeCollector.getShapes().size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape circle_1 = new ShapeCircle("Circle_1", 1);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addShape(circle_1);
        //When
        boolean removeResult = shapeCollector.removeShape(circle_1);
        //Then
        Assert.assertTrue(removeResult);
        Assert.assertEquals(0, shapeCollector.getShapes().size());
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape triangle_1 = new ShapeTriangle("Triangle_1", 2, 2);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addShape(triangle_1);
        //When
        Shape obtainedFigure = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(triangle_1, obtainedFigure);
    }

    //@Test
    //public void testShowFigures() {
        //Given
    //    Shape circle_1 = new ShapeCircle("Circle_1", 1);
    //    Shape square_1 = new ShapeSquare("Square_1", 12);
    //    Shape triangle_1 = new ShapeTriangle("Triangle_1", 2, 2);
    //    ShapeCollector shapeCollector = new ShapeCollector();
    //    shapeCollector.addShape(triangle_1);
    //    shapeCollector.addShape(circle_1);
    //    shapeCollector.addShape(square_1);
        //When
    //    Shape checkFigure1 = shapeCollector.getFigure(1);
    //    Shape checkFigure2 = shapeCollector.getFigure(2);
    //    Shape checkFigure3 = shapeCollector.getFigure(3);
        //Then
    //    Assert.assertEquals(checkFigure1, triangle_1);
    //    Assert.assertEquals(checkFigure2, circle_1);
    //    Assert.assertEquals(checkFigure3, square_1);
    //}
}
