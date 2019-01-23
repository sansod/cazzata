package it.linksmt.teamshare.service;

import java.util.List;

import it.linksmt.teamshare.business.dto.ImpedimentDto;

public interface ImpedimentService {

	public List<ImpedimentDto> getAll();
	public ImpedimentDto getImpediment(Integer id);
	public ImpedimentDto addImpediment(ImpedimentDto impediment);
	public ImpedimentDto updateTeam(Integer id, ImpedimentDto impediment);
	public void deleteImpediment(Integer id);
}
