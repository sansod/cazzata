package it.linksmt.teamshare.business.dto;

import java.io.Serializable;

public class NoteDto implements Serializable{

	private static final long serialVersionUID = -302175228098637738L;

	private long id;
	private String text;
	private Integer idActivity;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Integer getIdActivity() {
		return idActivity;
	}
	public void setIdActivity(Integer idActivity) {
		this.idActivity = idActivity;
	}
	
	
	
}
