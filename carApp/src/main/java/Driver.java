public class Driver {
    public static final int AGE_ADULT = 10;
    private String name;
    private int age;

    public Driver(String name, int years) {
        this.name = name;
        this.age = years;
    }

    public boolean isAdult() {
        return getAge() >= AGE_ADULT;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
