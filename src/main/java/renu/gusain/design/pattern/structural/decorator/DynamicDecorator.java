package renu.gusain.design.pattern.structural.decorator;

interface Shape {
    public String info();
}

class Circle implements Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String info() {
        return "A circle with radius " + radius;

    }
}

class Square implements Shape {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String info() {
        return "A square with side " + side;

    }
}

class ColoredShape implements Shape {
    String color;
    Shape shape;

    public ColoredShape(String color, Shape shape) {
        this.color = color;
        this.shape = shape;
    }

    @Override
    public String info() {
        return shape.info() + " has color " + color;
    }
}

public class DynamicDecorator {
    public static void main(String[] args) {
        Shape circle = new Circle(4);
        System.out.println(circle.info());
        ColoredShape coloredShape = new ColoredShape("blue", circle);
        System.out.println(coloredShape.info());
    }
}
