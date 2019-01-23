package it.linksmt.teamshare.business.dto;

import java.io.Serializable;
import java.util.Date;

import javassist.bytecode.ByteArray;

public class ContentDto implements Serializable{

	private static final long serialVersionUID = 4816775294478191845L;

	private long id;
	private String title;
	private String fileName;
	private String format;
	private ByteArray file;
	private String url;
	private Date shareDate;
	private Integer idUserCreator;
	private String type;
	
	
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
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public ByteArray getFile() {
		return file;
	}
	public void setFile(ByteArray file) {
		this.file = file;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getShareDate() {
		return shareDate;
	}
	public void setShareDate(Date shareDate) {
		this.shareDate = shareDate;
	}
	public Integer getIdUserCreator() {
		return idUserCreator;
	}
	public void setIdUserCreator(Integer idUserCreator) {
		this.idUserCreator = idUserCreator;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
