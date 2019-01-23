package it.linksmt.teamshare.service;

import java.util.List;

import it.linksmt.teamshare.business.dto.NoteDto;

public interface NoteService {

	public List<NoteDto> getNote();
	public NoteDto addNote(NoteDto nota);
	public NoteDto updateNote(Integer idNota, NoteDto nota );
	public void deleteNote(Integer idNota);
}
