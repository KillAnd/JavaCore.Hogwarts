import java.util.Objects;

public class Griffendor extends Hogwarts {

    private final int nobility;
    private final int honor;
    private final int bravery;

    public Griffendor(String name, int witchcraft, int transgression, int nobility, int honor, int bravery) {
        super(name, witchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }


    public int getHonor() {
        return honor;
    }


    public int getBravery() {
        return bravery;
    }


    @Override
    public String toString() {
        return "Студент Гриффиндора " + getName() +
                " благородство " + nobility +
                ", честь " + honor +
                ", храбрость " + bravery + ", умение трансгриссировать " + getTransgression() +
                ", умение колдовать " + getWitchcraft();
    }


}

