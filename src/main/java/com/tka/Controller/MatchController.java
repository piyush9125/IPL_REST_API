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

import com.tka.Model.Match;
import com.tka.Service.MatchService;

@RestController
@RequestMapping("/api/matches")
public class MatchController {
	
	@Autowired
	private MatchService matchservice;
	
	
	@PostMapping("insert")
	public String addmatchController(@RequestBody Match match) {
		String msg = matchservice.addmatchService(match);
		return msg;
	}
	
	@GetMapping("display")
	public ArrayList<Match> DisplayMatchController(){
		ArrayList<Match> list =matchservice.DisplayMatchService();
		return list;
	}
	
	@GetMapping("/find")
	public Object findMatchesbyidController(@RequestParam("id")int  id) {
		Object mm = matchservice.findMatchesbyidService(id);
		return mm;
	}
	
	@DeleteMapping("delete/{id}")
	public String DeleteMatcheController(@PathVariable int id) {
		String msg=matchservice.DeleteMatcheService(id);
		return msg;
	}
	
	
	@PutMapping("update/{id}")
	public String UpdateMatcheController(@RequestBody Match match,@PathVariable int id) {
		
		String msg =matchservice.UpdateMatcheController(match,id);
		return msg;
		
	}
	
	
	

}
