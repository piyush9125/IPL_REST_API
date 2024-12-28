
package com.tka.Model;

public class Match {
	
	private int matchId;
	private int team1;
	private int team2;
	private String date;
	private String location;
	private String result;
	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Match(int matchId, int team1, int team2, String date, String location, String result) {
		super();
		this.matchId = matchId;
		this.team1 = team1;
		this.team2 = team2;
		this.date = date;
		this.location = location;
		this.result = result;
	}
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public int getTeam1() {
		return team1;
	}
	public void setTeam1(int team1) {
		this.team1 = team1;
	}
	public int getTeam2() {
		return team2;
	}
	public void setTeam2(int team2) {
		this.team2 = team2;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", team1=" + team1 + ", team2=" + team2 + ", date=" + date + ", location="
				+ location + ", result=" + result + "]";
	}
	
	

}
