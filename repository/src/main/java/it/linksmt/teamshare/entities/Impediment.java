package it.linksmt.teamshare.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_impediment")
public class Impediment implements Serializable{

	private static final long serialVersionUID = -7290392389156724059L;

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "descriprion", nullable = false)
	private String description;
	
	@Column(name = "reporting_date", nullable = false)
	private Date reportingDate;
	
	@OneToOne
	@JoinColumn(name = "id_activity", nullable = false)
	private Activity activity;
	
	@ManyToOne(targetEntity = Team.class)
	@JoinColumn(name = "id_team", referencedColumnName = "id")
	private Team team;
	

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

	public Date getReportingDate() {
		return reportingDate;
	}

	public void setReportingDate(Date reportingDate) {
		this.reportingDate = reportingDate;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
}
