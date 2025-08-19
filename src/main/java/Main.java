public class Main {
    public static void main(String[] args) {
        Person alice = new Person("Alice");
        Person bob   = new Person("Bob");
        Person carol = new Person("Carol");

        bob.setMentor(alice);                 // Bob -> mentor -> Alice
        carol.setMentor(bob);                 // Carol -> mentor -> Bob
        alice.setChildren(new Person[]{ bob, carol }); // Alice -> children -> {Bob, Carol}

        System.out.println("OK");
    }
}
