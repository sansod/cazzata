package it.linksmt.teamshare.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import it.linksmt.teamshare.business.dto.UserDto;
import it.linksmt.teamshare.service.UserService;
import springfox.documentation.swagger2.mappers.ModelMapper;

@Api(tags = { "User" })
@RestController
@RequestMapping(value = "/private/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	ModelMapper modelMapper;
	
	@GetMapping(value = "/")
	public ResponseEntity<List<UserDto>> getUsers() {
		List<UserDto> users = new ArrayList<UserDto>();
		users = userService.getAllUsers();
		return new ResponseEntity<List<UserDto>>(users, HttpStatus.OK);
	}
}
