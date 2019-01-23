package it.linksmt.teamshare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.linksmt.teamshare.entities.Sprint;
@Repository
public interface SprintRelease extends JpaRepository<Sprint, Long> {

}
