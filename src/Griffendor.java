import java.util.Objects;

public class Griffendor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Griffendor(String name, int witchcraft, int transgression,  int nobility, int honor, int bravery) {
        super(name, witchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Студент Гриффиндора " + getName() +
                " благородство " + nobility +
                ", честь " + honor +
                ", храбрость " + bravery + ", умение трансгриссировать " + getTransgression() +
                ", умение колдовать " + getWitchcraft();
    }

    public void comparedStudentGriffindor(int numbers, int numbers2) {
        Hogwarts[] students = {
                new Griffendor("Harry Potter", 30, 15, 80, 90, 100),
                new Griffendor("Ronald Weasley", 15, 13, 90, 100, 60),
                new Griffendor("Hermione Granger", 90, 80, 70, 90, 80)
        };
        int compare = 0;
        int compare2 = 0;
        for (int i = 0; i < students.length; i++) {
            if (i == numbers) {
                compare = getNobility() + getHonor() + getBravery() + getWitchcraft() + getTransgression();
                System.out.println("У студента " + students[i].getName() + " в общем " + compare + " баллов!");
            }
            if (i == numbers2) {
                compare2 = getNobility() + getHonor() + getBravery() + getWitchcraft() + getTransgression();
                System.out.println("У студента " + students[i].getName() + " в общем " + compare2 + " баллов!");
            }
            boolean compareWin = compare > compare2;
            if (compareWin){
                System.out.println("Студент " + students[i].getName() + " лучший!");
            } else {
                System.out.println("Студент " + students[i].getName() + " лучший!");
            }
        }
    }
}
