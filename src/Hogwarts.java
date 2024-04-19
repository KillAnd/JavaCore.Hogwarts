public class Hogwarts {

private final String name;
private int transgression;
private int witchcraft;

    public Hogwarts(String name, int transgression, int witchcraft) {
        this.name = name;
        this.transgression = transgression;
        this.witchcraft = witchcraft;
    }

    public String getName() {
        return name;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

}
