package it.linksmt.teamshare.business.dto;

import java.io.Serializable;
import java.util.Date;

public class ActivityDto implements Serializable{

	private static final long serialVersionUID = -6021303251188181211L;

	private long id;
	private String title;
	private String description;
	private String type;
	private String priority;
	private Integer idUserCreator;
	private Integer idUserAssignee;
	private Date dataTakenInCharge;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public Integer getIdUserCreator() {
		return idUserCreator;
	}
	public void setIdUserCreator(Integer idUserCreator) {
		this.idUserCreator = idUserCreator;
	}
	public Integer getIdUserAssignee() {
		return idUserAssignee;
	}
	public void setIdUserAssignee(Integer idUserAssignee) {
		this.idUserAssignee = idUserAssignee;
	}
	public Date getDataTakenInCharge() {
		return dataTakenInCharge;
	}
	public void setDataTakenInCharge(Date dataTakenInCharge) {
		this.dataTakenInCharge = dataTakenInCharge;
	}
	
	
	
}
