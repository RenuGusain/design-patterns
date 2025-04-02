package renu.gusain.design.pattern.creational.factory.abstractfactory;



import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

interface IHotDrink {
    void consume();
}

class Tea implements IHotDrink {

    @Override
    public void consume() {
        System.out.println("I am drinking Tea");
    }
}
class Coffee implements IHotDrink {

    @Override
    public void consume() {
        System.out.println("I am drinking Coffie");
    }
}

interface IHotDrinkFactory
{
    IHotDrink prepare(int amount);
}
class TeaFactory implements IHotDrinkFactory
{

    @Override
    public IHotDrink prepare(int amount) {
        System.out.println("preparing tea");

        return new Tea();
    }
}
class CoffeeFactory implements IHotDrinkFactory
{

    @Override
    public IHotDrink prepare(int amount) {
        System.out.println("preparing Coffee");

        return new Coffee();
    }
}
class HotDrinkMachine {

    private Map<String, IHotDrinkFactory> factories = new HashMap<>();

    public HotDrinkMachine() throws Exception {
        Set<Class<? extends IHotDrinkFactory>> types = new Reflections("com.renu.java.tutorial.design.pattern.factory.abstractfactory")
                .getSubTypesOf(IHotDrinkFactory.class);
        for (Class<? extends IHotDrinkFactory> type : types) {
            factories.put(type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance());
        }

    }

    public IHotDrink makeDrink() throws Exception {
        System.out.println("Available Drinks");
        for(Map.Entry<String,IHotDrinkFactory>entry:factories.entrySet())
        {
            System.out.println(entry.getKey());
        }
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String input=br.readLine();
            if(input!=null&&(input.equals("Coffee")||input.equals("Tea")))
            {
                System.out.println("Enter amount");
                int amount=Integer.parseInt(br.readLine());
                return factories.get(input).prepare(amount);
            }
            System.out.println("incorrect input try again later");
        }

    }
}

public class AbstractFactoryDemo {
    public static void main(String[] args) throws Exception {
        IHotDrink drink=new HotDrinkMachine().makeDrink();

    }

}
