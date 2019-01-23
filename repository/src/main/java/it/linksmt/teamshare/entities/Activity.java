package it.linksmt.teamshare.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_activity")
public class Activity implements Serializable{

	private static final long serialVersionUID = 7646916767702987738L;

	@Id
	@GeneratedValue
	private long id;
	@Column(name = "title", nullable = false)
	private String title;
	@Column(name = "description", nullable = false)
	private String description;
	@Column(name = "type", nullable = false)
	private String type;
	@Column(name = "priority", nullable = false)
	private String priority;
	@Column(name = "dataTakenInCharge", nullable = false)
	private Date dateTakenInCharge;
	@OneToOne
	@JoinColumn(name = "id_user_creator")
	private User userCreator;
	@OneToOne
	@JoinColumn(name = "id_user_assignee")
	private User userAssignee;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "activity_sprint", joinColumns = @JoinColumn(name = "activity_id"), inverseJoinColumns = @JoinColumn(name = "sprint_id"))
	private List<Sprint> sprint;
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name = "activity_state", joinColumns = @JoinColumn(name = "activity_id"), inverseJoinColumns = @JoinColumn(name = "state_id"))
	private List<State> state;
	
	
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
	public Date getDateTakenInCharge() {
		return dateTakenInCharge;
	}
	public void setDateTakenInCharge(Date dateTakenInCharge) {
		this.dateTakenInCharge = dateTakenInCharge;
	}
	public User getUserCreator() {
		return userCreator;
	}
	public void setUserCreator(User userCreator) {
		this.userCreator = userCreator;
	}
	public User getUserAssignee() {
		return userAssignee;
	}
	public void setUserAssignee(User userAssignee) {
		this.userAssignee = userAssignee;
	}
}
