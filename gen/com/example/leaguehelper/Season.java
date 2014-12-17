package com.example.leaguehelper;
import java.util.ArrayList;

public class Season {
	private int numberOfGamesPerTeam;
	ArrayList<Team> teamList;
	ArrayList<Game> gameList;
	ArrayList<Player> leaguePlayerList;
	
	public Season(int n)
	{
		numberOfGamesPerTeam = n;
	}
	
	public int getNumberOfGamesPerTeam() { return numberOfGamesPerTeam; }
	public void setNumberOfGamesPerTeam(int n) { numberOfGamesPerTeam = n; }
	
	public ArrayList<Team> getTeamList() { return teamList; }
	public void addTeam(Team someTeam) { teamList.add(someTeam); }
	public void removeTeam(Team someTeam) { teamList.remove(someTeam); }
	
	public ArrayList<Game> getGameList() { return gameList; }
	public void addGame(Game someGame) { gameList.add(someGame); }
	public void removeGame(Game someGame) { gameList.remove(someGame); }
	
	public ArrayList<Player> getPlayerList() { return leaguePlayerList; }
	public void addPlayerToLeague(Player somePlayer, Team someTeam) 
	{
		leaguePlayerList.add(somePlayer);
		if (someTeam != null) someTeam.addPlayer(somePlayer);
		
	}
	public void removePlayerFromLeague(int playerIndex) 
	{
		//TODO:  get the player off the team!
		leaguePlayerList.remove(playerIndex);
	}
}
