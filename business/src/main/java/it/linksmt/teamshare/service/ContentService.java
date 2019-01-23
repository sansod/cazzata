package it.linksmt.teamshare.service;

import java.util.List;

import it.linksmt.teamshare.business.dto.ContentDto;

public interface ContentService {

	public List<ContentDto> getAll();
	public ContentDto addCont(ContentDto cont);
	public ContentDto updateCont(Integer contId, ContentDto cont);
	public void deleteCont(Integer contId);
}
