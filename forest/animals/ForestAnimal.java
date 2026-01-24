package forest.animals;

public class ForestAnimal {
    protected String name;
    protected int age;

    public ForestAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Forest animal " + name + " makes a generic sound.");
    }
}
