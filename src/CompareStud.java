public class CompareStud {

    public void compareStudentsGriffindor(int students1, int students2) {
        Griffendor[] students = {
                new Griffendor("Harry Potter", 30, 15, 80, 90, 100),
                new Griffendor("Ronald Weasley", 15, 13, 90, 100, 60),
                new Griffendor("Hermione Granger", 90, 80, 70, 90, 80)
        };
        int compare = 0;
        int compare2 = 0;
        for (int i = 0; i < students.length; i++) {
            if (i == students1) {
                students1 = i;
                compare = students[i].getNobility() + students[i].getHonor()
                        + students[i].getBravery() + students[i].getWitchcraft() + students[i].getTransgression();
                System.out.println("У студента " + students[i].getName() + " в общем " + compare + " баллов!");
            }
            if (i == students2) {
                students2 = i;
                compare2 = students[i].getNobility() + students[i].getHonor()
                        + students[i].getBravery() + students[i].getWitchcraft() + students[i].getTransgression();
                System.out.println("У студента " + students[i].getName() + " в общем " + compare2 + " баллов!");

            }
        }
        boolean compareWin = compare > compare2;
        if (compareWin){
            System.out.println("Студент " + students[students1].getName() + " лучший Гриффиндорец, чем " + students[students2].getName() + "!");
        } else {
            System.out.println("Студент " + students[students2].getName() + " лучший Гриффиндорец, чем " + students[students1].getName() + "!");
        }
    }

    public void compareStudentsSlytherin(int students1, int students2) {
        Slytherin[] students = {
                new Slytherin("Draco Malfoy", 30, 14, 60, 15, 80, 40, 100),
                new Slytherin("Graham Montague", 10, 5, 10, 20, 30, 11, 24),
                new Slytherin("Gregory Goyle", 12, 6, 34, 10, 90, 22, 38),
        };
        int compare = 0;
        int compare2 = 0;
        for (int i = 0; i < students.length; i++) {
            if (i == students1) {
                students1 = i;
                compare = students[i].getCunning() + students[i].getAmbition()
                        + students[i].getDetermination() + students[i].getResourcefulness()
                        + students[i].getThirstForPower() + students[i].getWitchcraft() + students[i].getTransgression();
                System.out.println("У студента " + students[i].getName() + " в общем " + compare + " баллов!");
            }
            if (i == students2) {
                students2 = i;
                compare2 = students[i].getCunning() + students[i].getAmbition()
                        + students[i].getDetermination() + students[i].getResourcefulness()
                        + students[i].getThirstForPower() + students[i].getWitchcraft() + students[i].getTransgression();
                System.out.println("У студента " + students[i].getName() + " в общем " + compare2 + " баллов!");

            }
        }
        boolean compareWin = compare > compare2;
        if (compareWin){
            System.out.println("Студент " + students[students1].getName() + " лучший Слизереновец, чем " + students[students2].getName() + "!");
        } else {
            System.out.println("Студент " + students[students2].getName() + " лучший Слизереновец, чем " + students[students1].getName() + "!");
        }
    }


    public void compareStudentsHufflepuff(int students1, int students2) {
        Hufflepuff[] students = {
                new Hufflepuff("Zachariah Smith", 15, 23, 40, 50, 30),
                new Hufflepuff("Cedric Diggory", 80, 90, 20, 60, 50),
                new Hufflepuff("Justin Finch-Fletchley", 40, 25, 34, 67, 22),
        };
        int compare = 0;
        int compare2 = 0;
        for (int i = 0; i < students.length; i++) {
            if (i == students1) {
                students1 = i;
                compare = students[i].getHardworking() + students[i].getHonest()
                        + students[i].getLoyal() + students[i].getWitchcraft() + students[i].getTransgression();
                System.out.println("У студента " + students[i].getName() + " в общем " + compare + " баллов!");
            }
            if (i == students2) {
                students2 = i;
                compare2 = students[i].getHardworking() + students[i].getHonest()
                        + students[i].getLoyal() + students[i].getWitchcraft() + students[i].getTransgression();
                System.out.println("У студента " + students[i].getName() + " в общем " + compare2 + " баллов!");

            }
        }
        boolean compareWin = compare > compare2;
        if (compareWin){
            System.out.println("Студент " + students[students1].getName() + " лучший Пуффендуец, чем " + students[students2].getName() + "!");
        } else {
            System.out.println("Студент " + students[students2].getName() + " лучший Пуффендуец, чем " + students[students1].getName() + "!");
        }
    }


    public void compareStudentsRavenclaw(int students1, int students2) {
        Ravenclaw[] students = {
                new Ravenclaw("Zhou Chang", 20, 38, 83, 35, 44, 32),
                new Ravenclaw("Padma Patil", 46, 22, 67, 88, 21, 100),
                new Ravenclaw("Marcus Belby", 10, 20, 15, 26, 88, 1)
        };
        int compare = 0;
        int compare2 = 0;
        for (int i = 0; i < students.length; i++) {
            if (i == students1) {
                students1 = i;
                compare = students[i].getCreativity() + students[i].getSmart()
                        + students[i].getWise() + students[i].getWitty() + students[i].getWitchcraft() + students[i].getTransgression();
                System.out.println("У студента " + students[i].getName() + " в общем " + compare + " баллов!");
            }
            if (i == students2) {
                students2 = i;
                compare2 = students[i].getCreativity() + students[i].getSmart()
                        + students[i].getWise() + students[i].getWitty() + students[i].getWitchcraft() + students[i].getTransgression();
                System.out.println("У студента " + students[i].getName() + " в общем " + compare2 + " баллов!");
            }
        }
        boolean compareWin = compare > compare2;
        if (compareWin){
            System.out.println("Студент " + students[students1].getName() + " лучший Когтевранец, чем " + students[students2].getName() + "!");
        } else {
            System.out.println("Студент " + students[students2].getName() + " лучший Когтевранец, чем " + students[students1].getName() + "!");
        }
    }

    public void comparedGeneralSkills(int student1, int student2) {
        Hogwarts[] students = {
                new Griffendor("Harry Potter", 30, 15, 80, 90, 100),
                new Griffendor("Ronald Weasley", 15, 13, 90, 100, 60),
                new Griffendor("Hermione Granger", 90, 80, 70, 90, 80),
                new Slytherin("Draco Malfoy", 30, 14, 60, 15, 80, 40, 100),
                new Slytherin("Graham Montague", 10, 5, 10, 20, 30, 11, 24),
                new Slytherin("Gregory Goyle", 12, 6, 34, 10, 90, 22, 38),
                new Hufflepuff("Zachariah Smith", 15, 23, 40, 50, 30),
                new Hufflepuff("Cedric Diggory", 80, 90, 20, 60, 50),
                new Hufflepuff("Justin Finch-Fletchley", 40, 25, 34, 67, 22),
                new Ravenclaw("Zhou Chang", 30, 38, 83, 35, 44, 32),
                new Ravenclaw("Padma Patil", 46, 22, 67, 88, 21, 100),
                new Ravenclaw("Marcus Belby", 10, 20, 15, 26, 88, 1)
        };
        int skill = 0; int skill2 = 0;
        for (int i = 0; i < students.length; i++) {
            if (i == student1) {
                skill = students[i].getTransgression() + students[i].getWitchcraft();
                System.out.println("Навык трансгриссирования студента " + students[i].getName() + " " +
                        students[i].getTransgression() + ", а навык колдовства " + students[i].getWitchcraft() + ".");
            }
            if (i == student2) {
                skill2 = students[i].getTransgression() + students[i].getWitchcraft();
                System.out.println("Навык трансгриссирования студента " + students[i].getName() + " " +
                        students[i].getTransgression() + ", а навык колдовства " + students[i].getWitchcraft() + ".");
            }
        }
        if (skill>skill2) {
            System.out.println(students[student1].getName() + " круче, чем " + students[student2].getName() + "!");
        } else if (skill<skill2){
            System.out.println(students[student2].getName() + " круче, чем " + students[student1].getName() + "!");
        } else {
            System.out.println(students[student2].getName() + " и " + students[student1].getName() + " равны по силам!");
        }
    }
}
