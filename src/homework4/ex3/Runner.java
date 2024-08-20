package homework4.ex3;

import homework4.ex3.making_sound.Bird;
import homework4.ex3.making_sound.MakingSound;
import homework4.ex3.making_sound.person.Builder;
import homework4.ex3.making_sound.person.Driver;
import homework4.ex3.making_sound.person.Person;

public class Runner {
    public static void main(String[] args) {
        makeSound();
    }

    public static void makeSound() {
        Person person = new Person();
        Builder builder = new Builder();
        Driver driver = new Driver();
        Bird bird = new Bird();
        MakingSound[] makingSounds = {person, builder, driver, bird};
        for (MakingSound makingSound : makingSounds) {
            makingSound.sound();
            System.out.println("------");
        }
    }
}
