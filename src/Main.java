public class Main {
    public static void main(String[] args) {

        Griffendor[] griffendorStudy = new Griffendor[]{
          new Griffendor("Harry Potter", 30, 15, 80, 90, 100),
          new Griffendor("Ronald Weasley", 15, 13, 90, 100, 60),
          new Griffendor("Hermione Granger", 90, 80, 70, 90, 80)
        };

        Slytherin[] slytherinStudy = new Slytherin[]{
          new Slytherin("Draco Malfoy", 30, 14, 60, 15, 80, 40, 100),
          new Slytherin("Graham Montague", 10, 5, 10, 20, 30 , 11, 24),
          new Slytherin("Gregory Goyle", 12, 6, 34, 10, 90, 22, 38)
        };

        Hufflepuff[] hufflepuffStudy = new Hufflepuff[]{
                new Hufflepuff("Zachariah Smith", 15, 23, 40, 50, 30),
                new Hufflepuff("Cedric Diggory", 80, 90, 20, 60, 50),
                new Hufflepuff("Justin Finch-Fletchley", 40, 25, 34, 67, 22)
        };

        Ravenclaw[] ravenclawStudy = new Ravenclaw[]{
                new Ravenclaw("Zhou Chang", 20, 38, 83, 35, 44, 32),
                new Ravenclaw("Padma Patil", 46, 22, 67, 88, 21, 100),
                new Ravenclaw("Marcus Belby", 10, 20, 15, 26, 88, 1)
        };

    }
}