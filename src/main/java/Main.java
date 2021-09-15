import udemy.generics.BaseballPLayer;
import udemy.generics.FootballPlayer;
import udemy.generics.SoccerPlayer;
import udemy.generics.Team;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPLayer pat = new BaseballPLayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> footballTeam = new Team<>("Football Team");
        footballTeam.addPlayer(joe);
        Team<BaseballPLayer> baseballTeam = new Team<>("Baseball Team");
        baseballTeam.addPlayer(pat);
        Team<SoccerPlayer> soccerTeam = new Team<>("Soccer Team");
        soccerTeam.addPlayer(beckham);

        Team<FootballPlayer> footballTeam2 = new Team<>("Football Team 2");
        FootballPlayer banks = new FootballPlayer("Banks");
        footballTeam2.addPlayer(banks);

        Team<FootballPlayer> footballTeam3 = new Team<>("Football Team 3");
        Team<FootballPlayer> footballTeam4 = new Team<>("Football Team 4");

        footballTeam3.matchResult(footballTeam4, 1, 0);
        footballTeam3.matchResult(footballTeam, 3, 8);

        footballTeam.matchResult(footballTeam4, 2, 1);
    }
}