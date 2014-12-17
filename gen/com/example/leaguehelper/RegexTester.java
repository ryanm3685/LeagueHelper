package com.example.leaguehelper;

public class RegexTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] emails = {"ryan@yahoo.com", "ryan@abcd", "colin@gmail.ca" };
		String[] phones = {"412-123-4567", "412-412-412", "1-2-3-4444", "724-999-8888"};
		Player p = new Player("Ryan");
		
		for (String s : emails)
		{
			if (p.setEmail(s)) System.out.println(p.getEmail());
		}
		
		for (String s : phones)
		{
			if (p.setPhoneNumber(s)) System.out.println(p.getPhoneNumber());
		}
	}

}
