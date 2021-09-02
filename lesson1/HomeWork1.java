package lesson1;

public class HomeWork1 {
    public static void main (String [] args) {
        Cat cat1 = new Cat("Барсик", "белый", 1);

        Cat cat2 = new Cat("Морис", "black", 1);

        Cat cat3 = new Cat("Морис", "black", 1);

        Wolf wolf = new Wolf("Тревор", "Серый", 6);

        Animal cat4 = new Cat("Морис", "red", 10);

        Team team1 = new Team("Волкины бунтари", cat1, cat2, cat3, wolf);

        team1.printQualInfo();

        team1.printTeamInfo();


    }
}
