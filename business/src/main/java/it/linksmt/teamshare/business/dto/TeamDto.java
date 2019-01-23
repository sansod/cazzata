package it.linksmt.teamshare.business.dto;

import java.io.Serializable;

public class TeamDto implements Serializable{

	private static final long serialVersionUID = -4239787739545310613L;

	private long id;
	private String nameTeam;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNameTeam() {
		return nameTeam;
	}
	public void setNomeTeam(String nomeTeam) {
		this.nameTeam = nomeTeam;
	}
	
	
}
