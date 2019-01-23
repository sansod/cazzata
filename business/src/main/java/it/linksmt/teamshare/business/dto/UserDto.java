package it.linksmt.teamshare.business.dto;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

public class UserDto implements Serializable{

	private static final long serialVersionUID = 4791157157419322343L;

	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Date birthDate;
	private Blob Avatar;
	
	
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
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Blob getAvatar() {
		return Avatar;
	}
	public void setAvatar(Blob avatar) {
		Avatar = avatar;
	}
}
