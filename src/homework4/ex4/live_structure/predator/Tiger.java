package homework4.ex4.live_structure.predator;

import homework4.ex4.live_structure.Live;
import homework4.ex4.live_structure.my_exception.TheAnimalCannotAttackException;

public class Tiger extends Predator {
    public Tiger(boolean livingDead, double weight) {
        super(livingDead, weight);
    }

    @Override
    public void attackLive(Live live) throws TheAnimalCannotAttackException {
        if (isLivingDead()) {
            throw new TheAnimalCannotAttackException("Животное не может нападать");
        } else {
            if (live.getWeight() > getWeight() * 2) {
                die();
                System.out.println("атакующий погиб ");
            } else {
                double weight = getWeight();
                weight += live.getWeight() / 3;
                live.die();
                System.out.println("Жертва была съедена ");
            }
        }
    }

}
