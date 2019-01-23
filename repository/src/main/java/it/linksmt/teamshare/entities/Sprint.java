package it.linksmt.teamshare.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "tb_sprints")
public class Sprint implements Serializable{

	
	private static final long serialVersionUID = 6863535776240251295L;

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "start_date", nullable = false)
	private Date startDate;
	
	@Column(name = "finish_date", nullable = false)
	private Date finishDate;
	
	@Column(name = "name_sprint", nullable = false)
	private String nameSprint;
	
	@ManyToOne(targetEntity = Release.class)
	@JoinColumn(name = "id_release")
	private Release release;
	
	@ManyToMany(mappedBy = "sprint")
	private List<Activity> activity;

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
