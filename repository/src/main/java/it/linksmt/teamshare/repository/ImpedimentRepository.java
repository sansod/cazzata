package it.linksmt.teamshare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.linksmt.teamshare.entities.Content;
@Repository
public interface ImpedimentRepository extends JpaRepository<Content, Long> {

}
