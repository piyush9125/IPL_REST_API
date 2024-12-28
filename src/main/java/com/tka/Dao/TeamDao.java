package com.tka.Dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.tka.Model.Team;
@Repository
public class TeamDao {
	
	
	ArrayList<Team> tt = new ArrayList<>();
	

	public TeamDao() {
		tt.add(new Team(1,"mumbai indians","mumbai","mahesh "));
		tt.add(new Team(2,"chennai super Kings","chennai","stephen fleming"));
		tt.add(new Team(3,"royal challenger","banglores","andy flower"));
		tt.add(new Team(4,"kolkata knight rides","kolkata","chandrakant pandit"));
	}
	
	
	public String addTeamDao(Team team) {
	    tt.add(team);
		return "successfully added list";
	}
	public ArrayList<Team> getallListDao() {
		
		return tt;
	}
	public Object getidService(int id) {
		for(Team kk : tt) {
			if(kk.getTeamId()==id) {
				return kk;
			}
			
		}
		return "Team Not Found";
	}
	public int DeleteTeamDao(int id) {
		
		for(Team kk :tt) {
			if(kk.getTeamId()==id) {
				tt.remove(kk);
				return 1;
			}
		
		}
		
		return 0;
	}


	public int UpdateDao(int id, Team team) {
		
		int status=DeleteTeamDao(id);
		if(status!=0) {
			tt.add(team);
			return 1;
		}


		return 0;
	}
	
	
	
	

}
