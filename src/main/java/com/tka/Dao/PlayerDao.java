package com.tka.Dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.tka.Model.Player;

@Repository
public class PlayerDao {

	
	ArrayList<Player> players = new ArrayList<>();
	
	public PlayerDao() {
	players.add(new Player(1,"VIRAT KOHLI",38,3,"BATSMAN"));
	players.add(new Player(2,"HARDIK PANDYA",38,3,"ALL-ROUNDER"));
	players.add(new Player(3,"JASPRIT BUMRAH",38,3,"BOWLER"));
	}
	
	public String AddplayerDao(Player player) {
		players.add(player);
		
		return "Players sucessfully added";
	}

	public ArrayList<Player> DisplayerPlayersDao() {
		
		return players;
	}

	public Object findPlayerDao(int id) {
		for(Player kk:players) {
		    if(kk.getPlayerId()==id) {
			return kk;
	      	}
	
	}
		return "player not found";
	}
	
	
	public int DeletePlayerDao(int id) {
		for(Player kk : players) {
			if(kk.getPlayerId()==id) {
				players.remove(id);
				return 1;
			}
			
		}
		return 0;
	}

	public int updatePlayerDao(Player player, int id) {
		int status =DeletePlayerDao(id);
		
		if(status!=0) {
			players.add(player);
			return 1;
		}
		else {
			return 0;
		}

	
	}}


