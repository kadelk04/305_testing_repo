public class Owner {
    private String name;
    private String age;
    private Cat pet;

    public Owner(String name, String age, Cat pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    public Cat getPet() {
        return pet;
    }
}
