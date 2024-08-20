package homework4.ex4;

import homework4.ex4.live_structure.herbirove.Elephant;
import homework4.ex4.live_structure.herbirove.Rabbit;
import homework4.ex4.live_structure.my_exception.TheAnimalCannotAttackException;
import homework4.ex4.live_structure.my_exception.TheAnimalCannotRunException;
import homework4.ex4.live_structure.predator.Tiger;
import homework4.ex4.live_structure.predator.Wolf;

public class Runner {
    public static void main(String[] args) {

        Tiger tiger = new Tiger(false, 300);
        Wolf wolf = new Wolf(false, 50);
        Rabbit rabbit = new Rabbit(false, 2);
        Elephant elephant = new Elephant(false, 2000);
        //2. Кролик должен пробежать
        try {
            rabbit.run();
        } catch (TheAnimalCannotRunException e) {
            throw new RuntimeException(e);
        }
        //3. Волк ест кролика
        try {
            wolf.attackLive(rabbit);
        } catch (TheAnimalCannotAttackException e) {
            throw new RuntimeException(e);
        }
        //4. Тигр ест волка
        try {
            tiger.attackLive(wolf);
        } catch (TheAnimalCannotAttackException e) {
            throw new RuntimeException(e);
        }
        //5. Тигр пытается съесть слона
        try {
            tiger.attackLive(elephant);
        } catch (TheAnimalCannotAttackException e) {
            throw new RuntimeException(e);
        }
        //6. Слон пробегает
        try {
            elephant.run();
        } catch (TheAnimalCannotRunException e) {
            throw new RuntimeException(e);
        }
        try {
            rabbit.run();
        } catch (TheAnimalCannotRunException e) {
            System.out.print("Животное не может бегать: ");
            rabbit.liveDie();
        }
    }
}
