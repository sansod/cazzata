package it.linksmt.teamshare.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "tb_team")
public class Team implements Serializable{

	private static final long serialVersionUID = -5095106184432182636L;

	@Id
	@GeneratedValue
	private long id;
	@Column(name = "name_team", nullable = false)
	private String nameTeam;
	
	@ManyToMany(mappedBy = "team")
	private List<User> user;
	@OneToMany(mappedBy = "team", cascade= {CascadeType.ALL}, orphanRemoval=true)
	private List<Impediment> impediment;
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name = "team_content", joinColumns = @JoinColumn(name = "team_id"), inverseJoinColumns = @JoinColumn(name = "content_id"))
	private List<Content> content;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNameTeam() {
		return nameTeam;
	}
	public void setNameTeam(String nameTeam) {
		this.nameTeam = nameTeam;
	}
	
	
}
