package homework4.ex3.making_sound.person;

import homework4.ex3.making_sound.MakingSound;

public class Driver extends Person implements MakingSound {
    @Override
    public void sound() {
        System.out.println("Я водитель.");
    }
}
