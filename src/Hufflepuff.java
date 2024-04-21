public class Hufflepuff extends Hogwarts{

    private final int hardworking;
    private final int loyal;
    private final int honest;

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }


    public int getHonest() {
        return honest;
    }

    public Hufflepuff(String name, int transgression, int witchcraft, int hardworking, int loyal, int honest) {
        super(name, transgression, witchcraft);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;


    }

    @Override
    public String toString() {
        return "Студент Пуффендуя " + getName() +
                " трудолюбие " + hardworking +
                ", верность " + loyal +
                ", честность " + honest + ", умение трансгриссировать " + getTransgression() +
                ", умение колдовать " + getWitchcraft();
    }
}
