package it.linksmt.teamshare.service;

import java.util.List;

import it.linksmt.teamshare.business.dto.ActivityDto;

public interface ActivityService {
	public List<ActivityDto> searchActivity();
	public ActivityDto getActivity(Integer id);
	public ActivityDto addActivity(ActivityDto att);
	public ActivityDto updateActivity(Integer attId, ActivityDto activity);
	public void deleteActivity(Integer id);
}
