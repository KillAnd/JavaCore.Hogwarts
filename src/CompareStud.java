public class CompareStud {

    public void compareStudentsGriffindor(Griffendor student, Griffendor student2) {

        int sumStudent = student.getNobility() + student.getBravery() + student.getHonor();
        int sumStudent2 = student2.getNobility() + student2.getBravery() + student2.getHonor();

        if (sumStudent > sumStudent2) {
            System.out.println(student.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else if (sumStudent < sumStudent2) {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student.getName());
        } else {
            System.out.println("Волшебники равны");
        }
    }

    public void compareStudentsSlytherin(Slytherin student, Slytherin student2) {

        int sumStudent = student.getAmbition() + student.getThirstForPower() + student.getResourcefulness() + student.getCunning() + student.getDetermination();
        int sumStudent2 = student2.getAmbition() + student2.getThirstForPower() + student2.getResourcefulness() + student2.getCunning() + student2.getDetermination();

        if (sumStudent > sumStudent2) {
            System.out.println(student.getName() + " лучший Слизереновец, чем " + student2.getName());
        } else if (sumStudent < sumStudent2) {
            System.out.println(student2.getName() + " лучший Слизереновец, чем " + student.getName());
        } else {
            System.out.println("Волшебники равны");
        }
    }


    public void compareStudentsHufflepuff(Hufflepuff student, Hufflepuff student2) {

        int sumStudent = student.getHardworking() + student.getLoyal() + student.getHonest();
        int sumStudent2 = student2.getHardworking() + student2.getLoyal() + student2.getHonest();

        if (sumStudent > sumStudent2) {
            System.out.println(student.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else if (sumStudent < sumStudent2) {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student.getName());
        } else {
            System.out.println("Волшебники равны");
        }
    }


    public void compareStudentsRavenclaw(Ravenclaw student, Ravenclaw student2) {

        int sumStudent = student.getCreativity() + student.getWitty() + student.getWise() + student.getSmart();
        int sumStudent2 = student2.getCreativity() + student2.getWitty() + student2.getWise() + student2.getSmart();

        if (sumStudent > sumStudent2) {
            System.out.println(student.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else if (sumStudent < sumStudent2) {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student.getName());
        } else {
            System.out.println("Волшебники равны");
        }
    }


    public void comparedGeneralSkills(Hogwarts student1, Hogwarts student2) {
        int skill = student1.getTransgression() + student1.getWitchcraft();
        int skill2 = student2.getTransgression() + student2.getWitchcraft();
        System.out.println("У студента " + student1.getName() +
                " навык трансгрессирования " + student1.getTransgression() + " баллов, а умение колдовать " +
                student1.getWitchcraft() + " баллов.");
        System.out.println("У студента " + student2.getName() +
                " навык трансгрессирования " + student2.getTransgression() + " баллов, а умение колдовать " +
                student2.getWitchcraft() + " баллов.");

        if (skill > skill2) {
            System.out.println(student1.getName() + " круче, чем " + student2.getName() + "!");
        } else if (skill < skill2) {
            System.out.println(student2.getName() + " круче, чем " + student2.getName() + "!");
        } else {
            System.out.println("Волшебники " + student1.getName() + student2.getName() + " равны");
        }
    }
}
