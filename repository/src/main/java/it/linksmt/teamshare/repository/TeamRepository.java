package it.linksmt.teamshare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.linksmt.teamshare.entities.Team;
@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

	Team findByTeamName(String teamName);
	
}
