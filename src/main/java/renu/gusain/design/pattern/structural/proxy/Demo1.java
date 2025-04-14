package renu.gusain.design.pattern.structural.proxy;
 interface Image
{
    void display();

}
 class RealImage implements Image
{
    private String filename;
    RealImage(String fileName)
    {
        this.filename=fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);

    }

}
class ProxyImage implements Image
{
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);  // Load only when needed
        }
        realImage.display();

    }
}

public class Demo1 {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo.jpg");

        System.out.println("Image will be displayed first time:");
        image.display();  // Loads and displays

        System.out.println("\nImage will be displayed second time:");
        image.display();  // Just displays, no loading
    }
}
