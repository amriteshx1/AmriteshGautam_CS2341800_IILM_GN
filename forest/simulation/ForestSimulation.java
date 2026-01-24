package forest.simulation;

import forest.animals.*;
import forest.wild.Lion;
import forest.herbivore.Deer;

public class ForestSimulation {

    public static void main(String[] args) {

        ForestAnimal animal1 = new Lion("Leo", 5);
        ForestAnimal animal2 = new Deer("Bambi", 3);
        ForestAnimal animal3 = new WildAnimal("Wolfy", 4);
        ForestAnimal animal4 = new HerbivoreAnimal("Gira", 6);

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
        animal4.makeSound();
    }
}
