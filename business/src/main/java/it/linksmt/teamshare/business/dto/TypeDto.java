package it.linksmt.teamshare.business.dto;

import java.io.Serializable;

public class TypeDto implements Serializable{

	private static final long serialVersionUID = -4875567260307575623L;

	private long id;
	private String name;
	private String pathImage;
		
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPathImage() {
		return pathImage;
	}
	public void setPathImage(String pathImage) {
		this.pathImage = pathImage;
	}	
}
