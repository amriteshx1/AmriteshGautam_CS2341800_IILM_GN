package forest.wild;

import forest.animals.WildAnimal;

public class Lion extends WildAnimal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Lion " + name + " roars loudly!");
    }
}
