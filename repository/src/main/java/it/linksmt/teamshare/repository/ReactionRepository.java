package it.linksmt.teamshare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.linksmt.teamshare.entities.Reaction;
@Repository
public interface ReactionRepository extends JpaRepository<Reaction, Long> {

}
