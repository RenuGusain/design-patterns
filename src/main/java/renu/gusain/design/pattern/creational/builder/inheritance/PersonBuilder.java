package renu.gusain.design.pattern.creational.builder.inheritance;

public class PersonBuilder <T extends PersonBuilder<T>>{
    protected String name;
    public T setName(String name)
    {
        this.name=name;
        return getSelf();
    }
    public Person build()
    {
        Person p=new Person();
        p.setName(this.name);
        return p;
    }
    protected T getSelf()
    {
        return (T)this;
    }
}
