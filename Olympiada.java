package ru.geekbrains;

public class Olympiada {

    public static void main(String[] args) {
        Player[] person = new Player[4];
        person[0] = new Player ("Arkadiy", 15);
        person[1] = new Player("Boris",10);
        person[2] = new Player ("Vladimir", 20);
        person[3] = new Player ("Grigoriy", 10);

        Team team = new Team("White Bears", person);
        team.showOnDistance("White Bears");

        Competition[] c = new Competition[2];
        c[0] = new Competition("run", 15);
        c[1] = new Competition("swim", 10);

        System.out.println();
        Course course = new Course(c);
        course.showOnDistance();
        System.out.println();

        course.doIt(team);
        team.showOnDistance("White Bears");

    }
}
