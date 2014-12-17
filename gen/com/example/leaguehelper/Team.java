package com.example.leaguehelper;
import java.util.ArrayList;

public class Team {
	private int season_id;
	private ArrayList<Player> playerList;
	private int wins, losses;
	private String name;
	
	public Team(String theName)
	{
		playerList = new ArrayList<Player>();
		wins = 0;
		losses = 0;
		name = theName;
	}
	
	public void addPlayer(Player thePlayer){ playerList.add(thePlayer); }
	public void removePlayer(int playerIndex) {playerList.remove(playerIndex); }
	
	public void addWin() { wins++; }
	public void addLoss() { losses++; }
	
	//try not to use these two methods under most circumstances
	public void setWins(int theWins) {wins = theWins; }
	public void setLosses(int theLosses) {losses = theLosses; }
	
	public void NotifyPlayers(String message)
	{
		for (Player p : playerList)
			p.NotifyPlayer(message);
	}
}
