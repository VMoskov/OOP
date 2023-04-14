abstract class Person {

    private final String name;

    protected Person(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected int myMethod() {
        return 0;
    }
}