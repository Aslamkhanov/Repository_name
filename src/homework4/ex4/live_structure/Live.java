package homework4.ex4.live_structure;

public abstract class Live {
    private boolean livingDead;
    private double weight;

    public Live(boolean livingDead, double weight) {
        this.livingDead = livingDead;
        this.weight = weight;
    }

    public void liveDie() {
        if (livingDead) {
            System.out.println("Мёртв");
        } else {
            System.out.println("Жив");
        }
    }

    public void die() {
        livingDead = true;
    }

    public boolean isLivingDead() {
        return livingDead;
    }

    public double getWeight() {
        return weight;
    }
}
