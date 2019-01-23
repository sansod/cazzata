package it.linksmt.teamshare.service;

import java.util.List;

import it.linksmt.teamshare.business.dto.TeamDto;

public interface TeamService {

	public List<TeamDto> getAll();
	public TeamDto getTeam(String nomeTeam);
	public TeamDto addTeam(TeamDto team);
	public TeamDto updateTeam(Integer teamId, TeamDto team);
	public void deleteTeam(Integer id);
}
