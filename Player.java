package ru.geekbrains;

public class Player {
    String namePlayer;
    int experience;
    boolean onDistance;

    Player (String namePlayer, int experience) {
        this.namePlayer = namePlayer;
        this.experience = experience;
        this.onDistance = false;
    }

    public int getExperience() {
        return experience;
    }

    public boolean getOnDistance() {
        return onDistance;
    }

    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }

    @Override
    public String toString() {
        return ("Name: " + namePlayer + "; Experience: " + experience + "; onDistance: " + onDistance);
    }
}
