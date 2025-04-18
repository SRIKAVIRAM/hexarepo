package com.hexa.inter;

public class CricketClub implements SportsClub {

    @Override
    public void showDetails() {
        System.out.println("no of players: 11 ");
    }

    @Override
    public void showTournaments() {
        System.out.println("IPL Tournament");
    }
}
