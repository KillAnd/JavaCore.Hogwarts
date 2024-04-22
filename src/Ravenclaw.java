public class Ravenclaw extends Hogwarts{

    private final int smart;
    private final int wise;
    private final int witty;
    private final int creativity;

    public Ravenclaw(String name, int transgression, int witchcraft, int smart, int wise,
                     int witty, int creativity) {
        super(name, transgression, witchcraft);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }


    public int getWise() {
        return wise;
    }


    public int getWitty() {
        return witty;
    }


    public int getCreativity() {
        return creativity;
    }


    @Override
    public String toString() {
        return "Студент Когтеврана " + getName() +
                " ум " + smart +
                ", мудрость " + wise +
                ", остроумие " + witty +
                ", творчество " + creativity + ", умение трансгриссировать " + getTransgression() +
                ", умение колдовать " + getWitchcraft();
    }
}
