package forest.herbivore;

import forest.animals.HerbivoreAnimal;

public class Deer extends HerbivoreAnimal {

    public Deer(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Deer " + name + " makes a soft sound.");
    }
}
