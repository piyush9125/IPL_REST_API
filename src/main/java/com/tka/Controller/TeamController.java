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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Model.Team;
import com.tka.Service.TeamService;

@RestController
@RequestMapping("/Api/teams")
public class TeamController {
	
	@Autowired
	private TeamService teamservice;
	
	@PostMapping("insert")
	public String addTeam(@RequestBody Team team) {
		String s = teamservice.addTeamService(team);
		return s;
	}
	
	
	
	@GetMapping("display")
	public ArrayList<Team> getallListController(){
		ArrayList<Team> team =teamservice.getallListService();
		return team;
	}
	
	
	@GetMapping("find/id")
	public Object getidController(@RequestParam("id") int id) {
		Object ss = teamservice.getidService(id);
		return ss;
	}
	
	
	@PutMapping("update/{id}")
	public String UpdateController(@RequestBody Team team,@PathVariable int id) {
		String msg= teamservice.UpdateService(team,id);
		
		return msg;
		
	}
	
	@DeleteMapping("delete/{id}")//{id} shouble be same of pathavariable
	public String DeleteTeamController(@PathVariable int id) {
		
		String ss=teamservice.DeleteTeamService(id);
		return ss;
		
		
	
	}
	
	
	

}
