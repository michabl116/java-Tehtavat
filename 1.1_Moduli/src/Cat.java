public class Cat {
    private String name;
    private String name2;

    public Cat(String name, String name2) {
        this.name = name;
        this.name2 = name2;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");


    }
    public void meow2() {
        System.out.println("The cat named " + name2 + " says: Meow!");
    }


    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        Cat cat = new Cat("Whiskers", "Rex");


        // Call the meow method on the cat instance
        cat.meow();
        cat.meow();
        cat.meow2();
        cat.meow();

    }

}
