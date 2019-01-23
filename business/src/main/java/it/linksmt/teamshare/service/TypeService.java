package it.linksmt.teamshare.service;

import java.util.List;

import it.linksmt.teamshare.business.dto.TypeDto;

public interface TypeService {

	public List<TypeDto> searchType();
	public TypeDto getType(Integer id);
	public TypeDto addType(TypeDto tipo);
	public TypeDto updateType(Integer tipoId, TypeDto tipo);
	public void deleteType(Integer id);
}
