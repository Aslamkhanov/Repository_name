package homework4.ex4.live_structure.herbirove;

import homework4.ex4.live_structure.my_exception.TheAnimalCannotRunException;

public class Elephant extends Herbivore {
    public Elephant(boolean livingDead, double weight) {
        super(livingDead, weight);
    }

    @Override
    public void run() throws TheAnimalCannotRunException {
        if (isLivingDead()) {
            throw new TheAnimalCannotRunException("Животное не может бегать");
        } else {
            System.out.println("слон медленно бежит");
        }
    }
}
