package it.linksmt.teamshare.business.dto;

import java.io.Serializable;

public class ReactionDto implements Serializable {

	private static final long serialVersionUID = -5554071001782827013L;

	private long id;
	private Long idUser;
	private Long idContent;
	private Long idType;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public Long getIdContent() {
		return idContent;
	}
	public void setIdContent(Long idContent) {
		this.idContent = idContent;
	}
	public Long getIdType() {
		return idType;
	}
	public void setIdType(Long idType) {
		this.idType = idType;
	}
	
	
		
}
