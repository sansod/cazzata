package it.linksmt.teamshare.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_release")
public class Release implements Serializable{

	private static final long serialVersionUID = 743174624188640150L;

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "name_release", nullable = false)
	private String nameRelease;
	
	@OneToMany(mappedBy = "release",cascade = {CascadeType.ALL},orphanRemoval = true)
	private List<Sprint> sprint;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameRelease() {
		return nameRelease;
	}

	public void setNameRelease(String nameRelease) {
		this.nameRelease = nameRelease;
	}
	
	
	
}
