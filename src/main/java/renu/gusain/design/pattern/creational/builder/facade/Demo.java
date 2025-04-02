package renu.gusain.design.pattern.creational.builder.facade;

public class Demo {
    public static void main(String[] args) {
        Person.PersonBuilder pb=new Person.PersonBuilder();
        Person p=pb.lives()
                .city("Noida")
                .add1("angle jupiter")
                .add2("c1104")
                .pinCode("201014")
                .state("UP")
                .country("India")
                .and()
                .works()
                .post("SSE")
                .companyName("Expedia")
                .empid("1")
                .salary(100000)
                .and().build();

        System.out.println(p);
    }
}
