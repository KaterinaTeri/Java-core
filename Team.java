package ru.geekbrains;

public class Team {
    String teamName;
    Player[] teamPlayer = new Player[4];

    Team (String teamName, Player[] setTeamPlayer){
        this.teamName = teamName;
        this.teamPlayer = setTeamPlayer;
    }

    public void showAll(Player[]teamPlayer) {
        for (Player player: teamPlayer) {
            System.out.println(player);
        }
    }

    public void showOnDistance(String teamName) {
        for (Player player : teamPlayer) {
            if (player.getOnDistance() == true) {
                System.out.println(player);
            }
        }
    }



//    public void showTeam() {
//        Player[] player = new Player[4];
//        player[0] = new Player ("Arkadiy", 15);
//        player[1] = new Player("Boris",10);
//        player[2] = new Player ("Vladimir", 20);
//        player[3] = new Player ("Grigoriy", 10);
 //       for (int i = 0; i < player.length; i++) {

//        }
//    }

}
