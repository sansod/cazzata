package it.linksmt.teamshare.business.dto;

import java.io.Serializable;

public class StateDto implements Serializable {

	private static final long serialVersionUID = -5938745907327993271L;

	private long id;
	private String nameState;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNameState() {
		return nameState;
	}
	public void setNameState(String nameState) {
		this.nameState = nameState;
	}
	
	
	
}
