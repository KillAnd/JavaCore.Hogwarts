public class Main {
    public static void main(String[] args) {

                Griffendor harryPotter = new Griffendor("Harry Potter", 30, 15, 80, 90, 100);
                Griffendor ronaldWeasley = new  Griffendor("Ronald Weasley", 15, 13, 90, 100, 60);
                Griffendor hermioneGranger = new  Griffendor("Hermione Granger", 90, 80, 70, 90, 80);
                Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 30, 14, 60, 15, 80, 40, 100);
                Slytherin grahamMontague = new Slytherin("Graham Montague", 10, 5, 10, 20, 30, 11, 24);
                Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 12, 6, 34, 10, 90, 22, 38);
                Hufflepuff zachariahSmith = new Hufflepuff("Zachariah Smith", 15, 23, 40, 50, 30);
                Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 80, 90, 20, 60, 50);
                Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 40, 25, 34, 67, 22);
                Ravenclaw zhouChang = new Ravenclaw("Zhou Chang", 20, 38, 83, 35, 44, 32);
                Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 46, 22, 67, 88, 21, 100);
                Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 10, 20, 15, 26, 88, 1);


        System.out.println(hermioneGranger);
        CompareStud compareStud = new CompareStud();
        compareStud.compareStudentsGriffindor(hermioneGranger,harryPotter);
        compareStud.compareStudentsSlytherin(gregoryGoyle, dracoMalfoy);
        compareStud.compareStudentsHufflepuff(cedricDiggory, justinFinchFletchley);
        compareStud.compareStudentsRavenclaw(zhouChang, padmaPatil);
        compareStud.comparedGeneralSkills(zachariahSmith,marcusBelby);




    }
}