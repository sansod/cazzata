package it.linksmt.teamshare.business.dto;

import java.io.Serializable;
import java.util.Date;

public class SprintDto implements Serializable{

	private static final long serialVersionUID = -6598262295874832316L;

	private long id;
	private Date startDate;
	private Date finishDate;
	private String nameSprint;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	public String getNameSprint() {
		return nameSprint;
	}
	public void setNameSprint(String nameSprint) {
		this.nameSprint = nameSprint;
	}
	
	


	
	
}
