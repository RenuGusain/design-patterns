package renu.gusain.design.pattern.structural.bridge;

interface Renderer {
    void drawCircle(float radius);
    void drawSquare(float s);
}

// Concrete Renderer
class PointRenderer implements Renderer {
    @Override
    public void drawCircle(float r) {
        System.out.println("Drawing circle with radius " + r);
    }

    @Override
    public void drawSquare(float s) {
        System.out.println("Drawing square with side " + s);
    }
}

// Abstract Shape
abstract class Shape {
    protected Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}

// Concrete Circle
class Circle extends Shape {
    protected float radius;

    public Circle(Renderer renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.drawCircle(radius);
    }
}

// Concrete Square
class Square extends Shape {
    protected float side;

    public Square(Renderer renderer, float side) {
        super(renderer);
        this.side = side;
    }

    @Override
    public void draw() {
        renderer.drawSquare(side);
    }
}

// Main Class
public class Example1 {
    public static void main(String[] args) {
        Renderer renderer = new PointRenderer();

        Shape circle = new Circle(renderer, 9);
        Shape square = new Square(renderer, 5);

        circle.draw();
        square.draw();
    }
}
