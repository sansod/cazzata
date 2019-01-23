package it.linksmt.teamshare.entities;

import java.io.Serializable;
import java.sql.Blob;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_users")
public class User implements Serializable {

	private static final long serialVersionUID = 5910036777540339106L;

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "birthDate")
	private Date birthDate;

	@Column(name = "email", unique = true, nullable = false)
	private String email;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "avatar")
	private Blob Avatar;

	@OneToMany(mappedBy = "user", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<Comment> commento;
	@OneToMany(mappedBy = "userCreator", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<Content> contenuto;
	@OneToMany(mappedBy = "user", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<Post> post;
	@OneToMany(mappedBy = "user", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<Reaction> reazione;
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "user_team", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "team_id"))
	private List<Team> team;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Blob getAvatar() {
		return Avatar;
	}

	public void setAvatar(Blob avatar) {
		Avatar = avatar;
	}

	public List<Comment> getCommento() {
		return commento;
	}

	public void setCommento(List<Comment> commento) {
		this.commento = commento;
	}

	public List<Content> getContenuto() {
		return contenuto;
	}

	public void setContenuto(List<Content> contenuto) {
		this.contenuto = contenuto;
	}

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}

	public List<Reaction> getReazione() {
		return reazione;
	}

	public void setReazione(List<Reaction> reazione) {
		this.reazione = reazione;
	}

	public List<Team> getTeam() {
		return team;
	}

	public void setTeam(List<Team> Team) {
		team = Team;
	}

}
