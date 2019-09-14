public class Lion extends Cat {
    public Lion(String lionName) {
        super(lionName);
    }

    @Override
    public String speak() {
        return "Roar, I am " + name;
    }
}
