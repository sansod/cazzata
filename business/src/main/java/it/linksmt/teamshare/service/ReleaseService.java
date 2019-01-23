package it.linksmt.teamshare.service;

import java.util.List;

import it.linksmt.teamshare.business.dto.ReleaseDto;

public interface ReleaseService {

	public List<ReleaseDto> searchRelease();
	public ReleaseDto getRelease(Integer id);
	public ReleaseDto addRelease(ReleaseDto att);
	public ReleaseDto updateRelease(Integer attId, ReleaseDto activity);
	public void deleteRelease(Integer id);
}
