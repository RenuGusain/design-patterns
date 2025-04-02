package renu.gusain.design.pattern.creational.singleton;

public enum EnumBasedSingleton
{
    RED,BLUE,GREEN;
    EnumBasedSingleton()
    {
        value=42;

    }
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
class Demo
{
    public static void main(String[] args) {
        EnumBasedSingleton enumBasedSingleton=EnumBasedSingleton.GREEN;
        System.out.println( enumBasedSingleton.getValue());
    }
}
