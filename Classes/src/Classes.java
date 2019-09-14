public class Classes {
    public static void main(String[] args) {
        System.out.println("We're learn about classes");

        Mammal someMammal = new Mammal();
        System.out.println(someMammal + " says " + someMammal.speak());

        Cat kitty = new Cat("Garfield");
        System.out.println(kitty.speak());

        Mammal felineMammal = new Cat("Felix");
        System.out.println(felineMammal.speak());

        Lion simba = new Lion("Simba");
        System.out.println(simba.speak());
    }
}
