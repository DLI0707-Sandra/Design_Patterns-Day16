package org.example.factory_pattern;

interface Shapes
{
    void display();
}

class Square implements Shapes
{
    @Override
    public void display() {
        System.out.println("Square");
    }
}

class Circle implements Shapes
{
    @Override
    public void display() {
        System.out.println("Circle");
    }
}

class Triangle implements Shapes
{
    @Override
    public void display() {
        System.out.println("Triangle");
    }
}

class ShapesFactory
{
    public static Shapes createShapes(String shape)
    {
        if("square".equalsIgnoreCase(shape))
            return new Square();
        else if("circle".equalsIgnoreCase(shape))
            return new Circle();
        else if("triangle".equalsIgnoreCase(shape))
            return new Triangle();
        else
            return null;
    }
}

public class CreateShapes
{
    public static void main(String[] args)
    {
        Shapes square=ShapesFactory.createShapes("square");
        square.display();
        Shapes circle=ShapesFactory.createShapes("circle");
        circle.display();

    }
}
