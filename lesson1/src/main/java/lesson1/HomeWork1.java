package lesson1;

public class HomeWork1 {
    public static void main (String [] args) {
        Cat cat1 = new Cat("Барсик", "белый", 1);

        Cat cat2 = new Cat("Морис", "black", 1);

        Cat cat3 = new Cat("Морис", "black", 1);

        Wolf wolf = new Wolf("Тревор", "Серый", 6);

        Animal cat4 = new Cat("Морис", "red", 10);

        cat1.setSwimmingSpeed(10);
        cat1.setRunningSpeed(20);
        cat1.setClimbingSpeed(30);
        cat2.setSwimmingSpeed(40);
        cat2.setRunningSpeed(50);
        cat2.setClimbingSpeed(60);
        cat3.setSwimmingSpeed(110);
        cat3.setRunningSpeed(120);
        cat3.setClimbingSpeed(130);
        wolf.setSwimmingSpeed(310);
        wolf.setRunningSpeed(220);
        wolf.setClimbingSpeed(30);


        Team team1 = new Team("Волкины бунтари", cat1, cat2, cat3, wolf);

        team1.printQualInfo();

        team1.printTeamInfo();

        Course course1 = new Course();
        Obstacle obstacle1 = new Mauntain(100);
        Obstacle obstacle2 = new Pool(50);
        Obstacle obstacle3 = new roadRunning(78);
        course1.addObstacle(obstacle1);
        course1.addObstacle(obstacle2);
        course1.addObstacle(obstacle3);
        course1.doIt(team1);
        team1.printQualInfo();

    }
}
