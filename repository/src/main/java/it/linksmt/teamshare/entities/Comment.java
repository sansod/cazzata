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
@Table(name = "tb_comment")
public class Comment implements Serializable{
	
	private static final long serialVersionUID = 8113807720209618904L;

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "comment_text", nullable = false)
	private String commentText;
	
	@ManyToOne(targetEntity = Post.class)
	@JoinColumn(name = "id_post", referencedColumnName = "id")
	private Post post;
	
	@ManyToOne(targetEntity = User.class)
	@JoinColumn(name = "id_user", referencedColumnName = "id")
	private User user;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
