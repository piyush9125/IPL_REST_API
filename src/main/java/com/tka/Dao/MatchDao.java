package com.tka.Dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.tka.Model.Match;
@Repository
public class MatchDao {

	ArrayList<Match> matches = new ArrayList();
	
	public MatchDao() {
		matches.add(new Match(1,1,2,"2024-12-25","banglore","RCB win by 7 wicket"));
	}
	
	public ArrayList<Match> DisplayMatchService() {
		// TODO Auto-generated method stub
		return matches;
	}

	public String addmatchDao(Match match) {
		matches.add(match);
		return "Match Schedule add sucessfully complete";
	}

	public Object findMatchesbyidDao(int id) {
		for(Match kk : matches) {
			if(kk.getMatchId()==id) {
				return kk;
			}
		}
		return "match is not founded";
	}

	public int DeleteMatcheService(int id) {
		
		for(Match kk : matches) {
			if(kk.getMatchId()==id) {
				matches.remove(kk);
				return 1;
			}
	
			}
		return 0;
		}

	public int UpdateMatcheService(Match match, int id) {
		int status =DeleteMatcheService(id);
		if(status!=0) {
			matches.add(match);
			return 1;
		}
		else {
			return 0;
		}
	}
	}


