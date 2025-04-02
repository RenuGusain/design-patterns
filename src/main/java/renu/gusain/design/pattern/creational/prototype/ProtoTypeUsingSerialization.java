package renu.gusain.design.pattern.creational.prototype;

import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;

class Laptop implements Serializable {
    private  int batteryLife;
    private  String processor;
    private  int ram;
    private  String model;
    private  int storage;
    private  String storageType;
    private  double screenSize;
    private  String operatingSystem;
    private  boolean isTouchscreen;
    private  double price;
    private  String brand;

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setTouchscreen(boolean touchscreen) {
        isTouchscreen = touchscreen;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Private Constructor (Only the Builder can access it)
    private Laptop(LaptopBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.storageType = builder.storageType;
        this.screenSize = builder.screenSize;
        this.operatingSystem = builder.operatingSystem;
        this.isTouchscreen = builder.isTouchscreen;
        this.price = builder.price;
        this.batteryLife = builder.batteryLife;
    }

    // Getters (No Setters to Ensure Immutability)
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getProcessor() { return processor; }
    public int getRam() { return ram; }
    public int getStorage() { return storage; }
    public String getStorageType() { return storageType; }
    public double getScreenSize() { return screenSize; }
    public String getOperatingSystem() { return operatingSystem; }
    public boolean isTouchscreen() { return isTouchscreen; }
    public double getPrice() { return price; }
    public int getBatteryLife() { return batteryLife; }


    // Display Laptop Details


     @Override
     public String toString() {
         return "Laptop{" +
                 "brand='" + brand + '\'' +
                 ", model='" + model + '\'' +
                 ", processor='" + processor + '\'' +
                 ", ram=" + ram +
                 ", storage=" + storage +
                 ", storageType='" + storageType + '\'' +
                 ", screenSize=" + screenSize +
                 ", operatingSystem='" + operatingSystem + '\'' +
                 ", isTouchscreen=" + isTouchscreen +
                 ", price=" + price +
                 ", batteryLife=" + batteryLife +
                 '}';
     }

     // **Static Nested Builder Class**
    public static class LaptopBuilder {
        private String brand;
        private String model;
        private String processor;
        private int ram;
        private int storage;
        private String storageType;
        private double screenSize;
        private String operatingSystem;
        private boolean isTouchscreen;
        private double price;
        private int batteryLife;

        // Builder Methods (Chaining Enabled)
        public LaptopBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public LaptopBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public LaptopBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public LaptopBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public LaptopBuilder setStorage(int storage, String storageType) {
            this.storage = storage;
            this.storageType = storageType;
            return this;
        }

        public LaptopBuilder setScreenSize(double screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public LaptopBuilder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public LaptopBuilder setTouchscreen(boolean isTouchscreen) {
            this.isTouchscreen = isTouchscreen;
            return this;
        }

        public LaptopBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public LaptopBuilder setBatteryLife(int batteryLife) {
            this.batteryLife = batteryLife;
            return this;
        }

        // Build Method
        public Laptop build() {
            return new Laptop(this);
        }
    }
}

public class ProtoTypeUsingSerialization {
    public static void main(String[] args) {

        Laptop appleLaptop = new Laptop.LaptopBuilder()
                .setBrand("Apple")
                .setModel("MacBook Pro 16")
                .setProcessor("Apple M2 Max")
                .setRam(32)
                .setStorage(1024, "SSD")
                .setScreenSize(16.2)
                .setOperatingSystem("macOS Ventura")
                .setTouchscreen(false)
                .setPrice(3499.99)
                .setBatteryLife(12)
                .build();
       Laptop dell= SerializationUtils.roundtrip(appleLaptop);
       dell.setBrand("Dell");
       dell.setModel("12 genration");
       dell.setOperatingSystem("windows");
        System.out.println(appleLaptop);
        System.out.println(dell);
    }

}
