package lesson1;

public class Team {
    private String teamName;
    private Animal[] teamMate;

    Team(String name, Animal a0, Animal a1, Animal a2, Animal a3){
        teamName = name;
        teamMate = new Animal[]{a0, a1, a2, a3};
//        teamMate[0] = a0;
//        teamMate[1] = a1;
//        teamMate[2] = a2;
//        teamMate[3] = a3;
    }
    public void printQualInfo() {
        for (Animal mate : teamMate) {
            System.out.println(mate.getName() + " из команды " + teamName + (mate.isQualification()? " прошёл дистанцию": " не прошёл дистанцию"));

        }
    }
    public void printTeamInfo() {
        System.out.println("Участники команды " + teamName + ":");
        for (Animal mate : teamMate) {
            System.out.println("Имя: " + mate.getName() + "\t" + "Возраст " + mate.getAge() + "\t" + "Цвет " + mate.getColor());
        }
    }

}

//название команды;
//массив из четырех участников — в конструкторе можно сразу всех участников указывать);
//метод для вывода информации о членах команды, прошедших дистанцию;
//метод вывода информации обо всех членах команды.
