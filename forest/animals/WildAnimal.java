package forest.animals;

public class WildAnimal extends ForestAnimal {

    public WildAnimal(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Wild animal " + name + " makes a wild sound.");
    }
}
