package it.linksmt.teamshare.service;

import java.util.List;

import it.linksmt.teamshare.business.dto.SprintDto;

public interface SprintService {

	public List<SprintDto> searchSprint();
	public SprintDto getSprint(Integer id);
	public SprintDto addSprint(SprintDto att);
	public SprintDto updateSprint(Integer attId, SprintDto activity);
	public void deleteSprint(Integer id);
}
