package com.shyam.spring.rest;

import java.util.ArrayList;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.spring.beans.TeamMember;

@CrossOrigin("*")
@RestController
public class HelloController {
	@RequestMapping(method=RequestMethod.GET , path="/hello")
	public String sayHello() {
		return "Wecome ="+"name1";
	}
	
	//Example of Getmapping and @RequestParam
	
	@GetMapping(path="/helloRequestParam")
	public String sayHelloWithRequestParam(@RequestParam("name") String namee) {
		return "Wecome ="+namee;
	}
	
	//Example of Getmapping and @PathVariable
	@GetMapping(path="/helloPathVariable/{namex}")
	public String sayHelloWithPathVariable(@PathVariable("namex") String namex) {
		return "Wecomex ="+namex;
	}
	
	@GetMapping(path="/getTeamMembersSummary")
	public  List<TeamMember> getTeamMembersSummary() {
		TeamMember t1 = new TeamMember("WEST",10,"Sahym");
		TeamMember t2 = new TeamMember("EAST",12,"Ram");
		TeamMember t3 = new TeamMember("SOUTH",14,"Hari");
		TeamMember t4 = new TeamMember("NORTH",16,"Gopal");
		List<TeamMember> tm = new ArrayList<TeamMember>();
		tm.add(t1); tm.add(t2); tm.add(t3); tm.add(t4);
		return tm;
	}
	
}