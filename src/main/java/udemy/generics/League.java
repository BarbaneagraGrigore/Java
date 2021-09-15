package udemy.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//League<U extends Player, T extends Team>
public class League<T extends Team> {
    public String name;
    private final List<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if (league.contains(team)) {
            return false;
        } else {
            league.add(team);
            return true;
        }
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + " : " + t.ranking());
        }
    }
}

//    League<Team<FootballPlayer>> footballLeague = new League<Team<FootballPlayer>>("AFL");
//    Team<FootballPlayer> footballTeam = new Team<>("Football Team");
//    Team<FootballPlayer> footballTeam2 = new Team<>("Football Team 2");
//    Team<FootballPlayer> footballTeam3 = new Team<>("Football Team 3");
//    Team<FootballPlayer> footballTeam4 = new Team<>("Football Team 4");
//
//        footballLeague.add(footballTeam);
//                footballLeague.add(footballTeam2);
//                footballLeague.add(footballTeam3);
//                footballLeague.add(footballTeam4);
//
//                footballLeague.showLeagueTable();
