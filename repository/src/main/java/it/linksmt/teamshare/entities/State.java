package it.linksmt.teamshare.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name = "tb_state")
public class State implements Serializable{

	private static final long serialVersionUID = -8229435846680132183L;

	@Id
	@GeneratedValue
	private long id;
	
	@ManyToMany(mappedBy = "state")
	private List<Activity> activity;
	
	@Column(name = "name_state", nullable = false)
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

	public void setNameState(String nomeState) {
		this.nameState = nomeState;
	}
	
	
}
