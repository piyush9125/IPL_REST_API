package com.tka.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Model.Player;
import com.tka.Service.PlayerService;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
	
	@Autowired
	private PlayerService playerservice;
	
	@PostMapping("insert")
	public String AddplayerController(@RequestBody Player player) {
		String msg = playerservice.AddplayerService(player);
		return msg;
	};
	
	
	@GetMapping("diplay")
	public ArrayList<Player> DisplayerPlayersController(){
		ArrayList<Player> list=playerservice.DisplayerPlayersService();
		return list;
	}
	
	
	@GetMapping("/find/player")
	public Object findPlayerController(@RequestParam("id") int id) {
		Object player=playerservice.findPlayerService(id);
		return player;
	}
	
	@DeleteMapping("delete/{id}")
	public String DeletePlayerController(@PathVariable int id) {
		String msg=playerservice.DeletePlayerService(id);
		return msg;
	}
	
	
	
	@PutMapping("update/{id}")
	public String updatePlayerController(@RequestBody Player player,@PathVariable int id) {
		String msg=playerservice.updatePlayerService(player,id);
		return msg;
		
	}

}
