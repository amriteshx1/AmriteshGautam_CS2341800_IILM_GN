package forest.animals;

public class HerbivoreAnimal extends ForestAnimal {

    public HerbivoreAnimal(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Herbivore animal " + name + " makes a calm sound.");
    }
}
