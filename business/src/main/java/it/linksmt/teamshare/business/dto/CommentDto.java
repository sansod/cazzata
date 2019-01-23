package it.linksmt.teamshare.business.dto;

import java.io.Serializable;

public class CommentDto implements Serializable{

	private static final long serialVersionUID = -8180778113771223399L;

	private long id;
	private String comment_text;
	private Integer idPost;
	private Integer idUser;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getComment_text() {
		return comment_text;
	}
	public void setComment_text(String comment_text) {
		this.comment_text = comment_text;
	}
	public Integer getIdPost() {
		return idPost;
	}
	public void setIdPost(Integer idPost) {
		this.idPost = idPost;
	}
	public Integer getIdUser() {
		return idUser;
	}
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	
	
	
}
