package it.linksmt.teamshare.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_note")
public class Note implements Serializable{

	private static final long serialVersionUID = -7682293933991185102L;

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "text", nullable = false)
	private String text;
	
	@ManyToOne(targetEntity = Activity.class)
	@JoinColumn(name = "id_activity", referencedColumnName = "id")
	private Activity activity;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	
}
