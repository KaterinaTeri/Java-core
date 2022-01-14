package ru.geekbrains;

public class Competition {
    String competitionName;
    int distance;

    Competition(String competitionName, int distance) {
        this.competitionName = competitionName;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return ("CompetitionName: " + competitionName + "; distance: " + distance);
    }
}
