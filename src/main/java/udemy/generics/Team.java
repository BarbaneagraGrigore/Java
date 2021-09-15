package udemy.generics;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private final String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private final List<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team.");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPLayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        return Integer.compare(team.ranking(), this.ranking());
    }
}
//    FootballPlayer joe = new FootballPlayer("Joe");
//    BaseballPLayer pat = new BaseballPLayer("Pat");
//    SoccerPlayer beckham = new SoccerPlayer("Beckham");
//
//    Team<FootballPlayer> footballTeam = new Team<>("Football Team");
//        footballTeam.addPlayer(joe);
//                Team<BaseballPLayer> baseballTeam = new Team<>("Baseball Team");
//        baseballTeam.addPlayer(pat);
//        Team<SoccerPlayer> soccerTeam = new Team<>("Soccer Team");
//        soccerTeam.addPlayer(beckham);
//
//        Team<FootballPlayer> footballTeam2 = new Team<>("Football Team 2");
//        FootballPlayer banks = new FootballPlayer("Banks");
//        footballTeam2.addPlayer(banks);
//
//        Team<FootballPlayer> footballTeam3 = new Team<>("Football Team 3");
//        Team<FootballPlayer> footballTeam4 = new Team<>("Football Team 4");
//
//        footballTeam3.matchResult(footballTeam4, 1, 0);
//        footballTeam3.matchResult(footballTeam, 3, 8);
//
//        footballTeam.matchResult(footballTeam4, 2, 1);
//
//        System.out.println("Rankings");
//        System.out.println(footballTeam.getName() + " : " + footballTeam.ranking());
//        System.out.println(footballTeam2.getName() + " : " + footballTeam2.ranking());
//        System.out.println(footballTeam3.getName() + " : " + footballTeam3.ranking());
//        System.out.println(footballTeam4.getName() + " : " + footballTeam4.ranking());
//
//        System.out.println(footballTeam.compareTo(footballTeam2));
//        System.out.println(footballTeam.compareTo(footballTeam3));
//        System.out.println(footballTeam4.compareTo(footballTeam));