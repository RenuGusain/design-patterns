package renu.gusain.design.pattern.creational.prototype;
class Address
{
    String name;
    String city;
    String country;

    public Address(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public Address( Address address) {
        this(address.name,address.city,address.country);
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
class  Person
{
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Person(Person person) {
    this(person.name,new Address(person.address));

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
public class CopyConstructorDemo {
    public static void main(String[] args) {
        Person param=new Person("Param",new Address("London","Londo","UK"));
        Person renu=new Person(param);
        renu.name="Renu";
        System.out.println(param);
        System.out.println(renu);
    }
}
