public class Cat extends Mammal {
    protected String name;

    public Cat(String catName) {
        name = catName;
    }

    @Override
    public String speak() {
        return "Meow, I'm " + name;
    }
}
