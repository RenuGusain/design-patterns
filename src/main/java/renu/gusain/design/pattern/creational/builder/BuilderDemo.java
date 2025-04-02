package renu.gusain.design.pattern.creational.builder;

class Laptop {
    private final String os, name, color, processor, brand, model;
    private final int coreSize;

    private Laptop(LaptopBuilder builder) {
        this.os = builder.os;
        this.name = builder.name;
        this.color = builder.color;
        this.processor = builder.processor;
        this.brand = builder.brand;
        this.model = builder.model;
        this.coreSize = builder.coreSize;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "os='" + os + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", processor='" + processor + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", coreSize=" + coreSize +
                '}';
    }

    // Static Builder Class
    public static class LaptopBuilder {
        private String os, name, color, processor, brand, model;
        private int coreSize;

        public LaptopBuilder(String name) {
            this.name = name;
        }

        public LaptopBuilder setOS(String os) {
            this.os = os;
            return this;
        }

        public LaptopBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public LaptopBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public LaptopBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public LaptopBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public LaptopBuilder setCoreSize(int coreSize) {
            this.coreSize = coreSize;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }
}

public class BuilderDemo {
    public static void main(String[] args) {
        Laptop laptop = new Laptop.LaptopBuilder("Dell")
                .setBrand("Dell")
                .setOS("Windows")
                .setColor("White")
                .setModel("890")
                .setProcessor("Intel")
                .setCoreSize(4)
                .build();

        System.out.println(laptop);
    }
}
