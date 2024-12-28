package com.tka.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Dao.MatchDao;

import com.tka.Model.Match;
@Service
public class MatchService {

	@Autowired
	private MatchDao matchdao;
	
	public ArrayList<Match> DisplayMatchService() {
		ArrayList<Match> list=matchdao.DisplayMatchService();
		return list;
	}

	public String addmatchService(Match match) {
		String msg=matchdao.addmatchDao(match);
		return msg;
	}

	public Object findMatchesbyidService(int id) {
		Object mm =matchdao.findMatchesbyidDao(id);
		return mm;
	}

	public String DeleteMatcheService(int id) {
		int status=matchdao.DeleteMatcheService(id);
		if(status!=0) {
			return "Match deleted succefully completed";
		}
		else {
		return "Match not found";
		}
	}

	public String UpdateMatcheController(Match match, int id) {
		int status=matchdao.UpdateMatcheService(match,id);
		if(status!=0) {
			return "Match update succefully completed";
		}
		else {
		return "Match not found";
		}
	}

}
