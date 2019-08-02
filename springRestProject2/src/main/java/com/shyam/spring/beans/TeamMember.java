package com.shyam.spring.beans;

public class TeamMember {
	String region;
	int size;
	String teamLead;
	public TeamMember(String r,int s,String t){
		this.region = r;
		this.size=s;
		this.teamLead=t;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getTeamLead() {
		return teamLead;
	}
	public void setTeamLead(String teamLead) {
		this.teamLead = teamLead;
	}
	
	
}
