package it.linksmt.teamshare.service;

import java.util.List;

import it.linksmt.teamshare.business.dto.CommentDto;

public interface CommentService {

	public CommentDto addComment(CommentDto comment);
	public CommentDto updateComment(Integer idCommento, CommentDto comment);
	public void deleteComment(Integer idCommento);
	public List<CommentDto> getComment();
}
