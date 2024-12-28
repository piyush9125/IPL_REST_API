package com.tka.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Dao.TeamDao;
import com.tka.Model.Team;

@Service
public class TeamService {
	
	@Autowired
	private TeamDao teamdao;

	public String addTeamService(Team team) {
		String s =teamdao.addTeamDao(team);
		return s;
	}

	public ArrayList<Team> getallListService() {
		ArrayList<Team> teams =teamdao.getallListDao();
		return teams;
	}

	public Object getidService(int id) {
		Object ss=teamdao.getidService(id);
		return ss;
	}

	public String DeleteTeamService(int id) {
		int ss=teamdao.DeleteTeamDao(id);
		
		if(ss!=0) {
			return "Team deleted";
		}
		else {
			return "Team not found";
		}
		
	}

	public String UpdateService(Team team, int id) {
		int ss=teamdao.UpdateDao(id,team);
		if(ss!=0) {
			return "Team updated";
		}
		else {
			return "Team not found";
		}
		
		
	}

}
