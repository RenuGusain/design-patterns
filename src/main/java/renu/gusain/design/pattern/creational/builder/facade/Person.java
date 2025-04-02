package renu.gusain.design.pattern.creational.builder.facade;

public class Person {
    private final String city, pinCode, add1, add2, country, state;
    private final String empid, post, companyName, location;
    private final long salary;

    private Person(PersonBuilder builder) {
        this.city = builder.city;
        this.pinCode = builder.pinCode;
        this.add1 = builder.add1;
        this.add2 = builder.add2;
        this.country = builder.country;
        this.state = builder.state;
        this.empid = builder.empid;
        this.post = builder.post;
        this.companyName = builder.companyName;
        this.location = builder.location;
        this.salary = builder.salary;
    }

    public static class PersonBuilder {
        private String city, pinCode, add1, add2, country, state;
        private String empid, post, companyName, location;
        private long salary;

        public AddressBuilder lives() {
            return new AddressBuilder(this);
        }

        public EmploymentBuilder works() {
            return new EmploymentBuilder(this);
        }

        public Person build() {
            return new Person(this);
        }
    }

    public static class AddressBuilder {
        private final PersonBuilder builder;

        public AddressBuilder(PersonBuilder builder) {
            this.builder = builder;
        }

        public AddressBuilder city(String city) {
            builder.city = city;
            return this;
        }

        public AddressBuilder pinCode(String pinCode) {
            builder.pinCode = pinCode;
            return this;
        }

        public AddressBuilder add1(String add1) {
            builder.add1 = add1;
            return this;
        }

        public AddressBuilder add2(String add2) {
            builder.add2 = add2;
            return this;
        }

        public AddressBuilder country(String country) {
            builder.country = country;
            return this;
        }

        public AddressBuilder state(String state) {
            builder.state = state;
            return this;
        }

        public PersonBuilder and() {
            return builder;
        }
    }

    public static class EmploymentBuilder {
        private final PersonBuilder builder;

        public EmploymentBuilder(PersonBuilder builder) {
            this.builder = builder;
        }

        public EmploymentBuilder empid(String empid) {
            builder.empid = empid;
            return this;
        }

        public EmploymentBuilder post(String post) {
            builder.post = post;
            return this;
        }

        public EmploymentBuilder companyName(String companyName) {
            builder.companyName = companyName;
            return this;
        }

        public EmploymentBuilder location(String location) {
            builder.location = location;
            return this;
        }

        public EmploymentBuilder salary(long salary) {
            builder.salary = salary;
            return this;
        }

        public PersonBuilder and() {
            return builder;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "city='" + city + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", add1='" + add1 + '\'' +
                ", add2='" + add2 + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", empid='" + empid + '\'' +
                ", post='" + post + '\'' +
                ", companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}
