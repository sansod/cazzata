package it.linksmt.teamshare.business.dto;

import java.io.Serializable;
import java.util.Date;

public class ImpedimentDto implements Serializable{

	private static final long serialVersionUID = -7787291542350827736L;

	private long id;
	private String description;
	private Integer idTeam;
	private Integer idActivity;
	private Date reportingDate;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getIdTeam() {
		return idTeam;
	}
	public void setIdTeam(Integer idTeam) {
		this.idTeam = idTeam;
	}
	public Integer getIdActivity() {
		return idActivity;
	}
	public void setIdActivity(Integer idActivity) {
		this.idActivity = idActivity;
	}
	public Date getReportingDate() {
		return reportingDate;
	}
	public void setReportingDate(Date reportingDate) {
		this.reportingDate = reportingDate;
	}
	
	
	
}
