package it.linksmt.teamshare.service;

import java.util.List;

import it.linksmt.teamshare.business.dto.UserDto;

public interface UserService {
	
	public List<UserDto> getAllUsers();
	public UserDto getUser(long id);
	public UserDto addUser(UserDto user);
	public UserDto updateUser(long userId, UserDto user);
	public void deleteUser(long id);
}
