package com.tka.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Dao.PlayerDao;
import com.tka.Model.Player;
@Service
public class PlayerService {

	@Autowired
	private PlayerDao playerdao;
	
	public String AddplayerService(Player player) {
		String msg =playerdao.AddplayerDao(player);
		return msg;
	}

	public ArrayList<Player> DisplayerPlayersService() {
		ArrayList<Player> list=playerdao.DisplayerPlayersDao();
		return list;
	}

	public Object findPlayerService(int id) {
		Object player=playerdao.findPlayerDao(id);
		
		return player;
	
	}


	public String updatePlayerService(Player player, int id) {
		int status=playerdao.updatePlayerDao(player,id);
		if(status!=0) {
			return "Player details updated";
		}
		else {
		return "Player details not found";
		}
	}

	public String DeletePlayerService(int id) {
		int status=playerdao.DeletePlayerDao(id);
		if(status!=0) {
			return "Player details Deleted";
		}
		else {
		return "Player details not found";
		}
	}

}
