package it.linksmt.teamshare.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_reaction")
public class Reaction implements Serializable{

	private static final long serialVersionUID = 1447853257949044530L;

	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne(targetEntity = User.class)
	@JoinColumn(name = "id_user", referencedColumnName = "id")
	private User user;
	@ManyToOne(targetEntity = Content.class)
	@JoinColumn(name = "id_content", referencedColumnName = "id")
	private Content content;
	@ManyToOne(targetEntity = Type.class)
	@JoinColumn(name = "id_type", referencedColumnName = "id")
	private Type type;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Content getContent() {
		return content;
	}
	public void setContent(Content content) {
		this.content = content;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	
	
	
}
