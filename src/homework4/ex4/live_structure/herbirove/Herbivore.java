package homework4.ex4.live_structure.herbirove;

import homework4.ex4.live_structure.Live;
import homework4.ex4.live_structure.my_exception.TheAnimalCannotRunException;

public abstract class Herbivore extends Live {
    public Herbivore(boolean livingDead, double weight) {
        super(livingDead, weight);
    }

    public void run() throws TheAnimalCannotRunException {
        if (isLivingDead()) {
            throw new TheAnimalCannotRunException("Животное не может бегать");
        }
    }
}
