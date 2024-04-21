public class Slytherin extends Hogwarts {

    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;

    public Slytherin(String name, int transgression, int witchcraft, int cunning,
                     int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, transgression, witchcraft);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }


    public int getDetermination() {
        return determination;
    }


    public int getAmbition() {
        return ambition;
    }


    public int getResourcefulness() {
        return resourcefulness;
    }


    public int getThirstForPower() {
        return thirstForPower;
    }


    @Override
    public String toString() {
        return "Студент Слизерена " + getName() +
                " хитрость " + cunning +
                ", решительность " + determination +
                ", амбициозность " + ambition +
                ", находчивость " + resourcefulness +
                ", жажда власти " + thirstForPower + ", умение трансгриссировать " + getTransgression() +
                ", умение колдовать " + getWitchcraft();
    }
}
