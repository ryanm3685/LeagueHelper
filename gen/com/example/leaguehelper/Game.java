package com.example.leaguehelper;
import java.util.Calendar;


public class Game
{
	private Team firstTeam, secondTeam;
	private int firstTeamScore, secondTeamScore;
	private Calendar calendarInfo;
	
	public Game(Calendar c)
	{
		calendarInfo = c;
	}
	
	public Team getFirstTeam() { return firstTeam; }
	public void setFirstTeam(Team theTeam) { firstTeam = theTeam; }
	
	public Team getSecondTeam() { return secondTeam; }
	public void setSecondTeam(Team theTeam) { secondTeam = theTeam; }
	
	public int getFirstTeamScore() { return firstTeamScore; }
	public void addFirstTeamScore(int points) { firstTeamScore += points; }
	
	public int getSecondTeamScore() { return secondTeamScore; }
	public void addSecondTeamScore(int points) { secondTeamScore += points; }
	
	//avoid the use of these two methods if at all possible
	public void setFirstTeamSocre(int points) { firstTeamScore = points; }
	public void setSecondTeamSocre(int points) { secondTeamScore = points; }
	
	public void NotifyTeams(String message)
	{
		firstTeam.NotifyPlayers(message);
		secondTeam.NotifyPlayers(message);
	}
	
	public void finalizeGame()//after the game has ended
	{
		if (firstTeamScore > secondTeamScore)
		{
			firstTeam.addWin();
			secondTeam.addLoss();
		}
		else
		{
			firstTeam.addLoss();
			secondTeam.addWin();
		}
	}
}