package lambda;

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        System.out.println("name" + name);
        this.name = name;
    }

    public Person(String name, int age) {
        System.out.println(name + " " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
