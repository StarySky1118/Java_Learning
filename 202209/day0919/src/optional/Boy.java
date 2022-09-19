package optional;

public class Boy {
    private String name = "德川";

    public Boy() {
    }

    public Boy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "name='" + name + '\'' +
                '}';
    }
}
