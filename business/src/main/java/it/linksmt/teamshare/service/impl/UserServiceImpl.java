package it.linksmt.teamshare.service.impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.linksmt.teamshare.business.dto.UserDto;
import it.linksmt.teamshare.entities.User;
import it.linksmt.teamshare.repository.UserRepository;
import it.linksmt.teamshare.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	ModelMapper modelMapper;
	
	@Override
	public UserDto getUser(long id) {
		Optional<User> users = userRepository.findById(id);
		return null;
	}

	@Override
	public UserDto addUser(UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto updateUser(long userId, UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UserDto> getAllUsers() {
		List<User> users = (List<User>) userRepository.findAll();
		return (List<UserDto>) modelMapper.map(users, UserDto.class);
	}

}
