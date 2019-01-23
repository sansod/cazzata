package it.linksmt.teamshare.service;

import java.util.List;

import it.linksmt.teamshare.business.dto.PostDto;
import it.linksmt.teamshare.entities.User;

public interface PostService {

	public List<PostDto> getAll();
	public PostDto getPostByUtenteCreatore(User utenteCreatore);
	public PostDto addPost(PostDto postRequestDto);
	public void deletePost(Integer id);
}
