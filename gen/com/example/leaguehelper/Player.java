package com.example.leaguehelper;
import java.util.regex.Pattern;

public class Player {
	private int team_id; //what team (if any) is this player associated with? 999 is the "null value"
	private String name;
	//private Team theTeam;
	private Pattern phoneNumberPattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
	private Pattern emailPattern = Pattern.compile("\\D{1,}\\w+@\\w+\\.\\D{2,3}");
	private String phoneNumber;
	private String email;
	
	public Player(String theName/*, Team someTeam, String somePhone, String someEmail*/)
	{
		name = theName;
		/*theTeam = someTeam;
		setPhoneNumber(somePhone);
		setEmail(someEmail);*/
	}
	
	public int getTeamId() { return team_id; }
	public void setTeamId(int id) { team_id = id; }
	public void resetTeamId() { team_id = 999; }
	
	public String getName(){ return name; }
	public void setName(String theName){ name = theName; }
	
	/*public void setTeam(Team someTeam) {theTeam = someTeam; }
	public Team getTeam() {return theTeam; }*/
	
	public String getPhoneNumber() { return phoneNumber; }
	public boolean setPhoneNumber(String theNumber)
	{
		boolean retVal = theNumber.matches(phoneNumberPattern.pattern());
		if (retVal) phoneNumber = theNumber;
		
		return retVal;
	}
	
	public String getEmail() { return email; }
	public boolean setEmail(String theEmail)
	{
		boolean retVal = theEmail.matches(emailPattern.pattern());
		if (retVal) email = theEmail;
		
		return retVal;
	}
	
	public void NotifyPlayer(String message)
	{
		
	}
}
