package ru.geekbrains;

public class Course {
    Competition[] competitionCourse = new Competition[2];

    Course(Competition[] competitionCourse) {
        this.competitionCourse = competitionCourse;
    }

    public void doIt(Team team) {
        for (Competition competition : competitionCourse) {
            for (Player player : team.teamPlayer) {
                if (player.getExperience() - competition.getDistance() <= 0) {
                    player.setOnDistance(false);
                } else player.setOnDistance(true);
            }
        }
    }

    public void showOnDistance() {
        for (Competition competition : competitionCourse) {
            System.out.println(competition);
        }
    }
}
