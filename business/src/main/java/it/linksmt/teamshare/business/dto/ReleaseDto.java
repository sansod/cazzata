package it.linksmt.teamshare.business.dto;

import java.io.Serializable;

public class ReleaseDto implements Serializable{

	private static final long serialVersionUID = 4155555788059792027L;

	private long id;
	private String nameRelease;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNameRelease() {
		return nameRelease;
	}
	public void setNomeRelease(String nomeRelease) {
		this.nameRelease = nomeRelease;
	}
	
}
