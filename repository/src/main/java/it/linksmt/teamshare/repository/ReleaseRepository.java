package it.linksmt.teamshare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.linksmt.teamshare.entities.Release;
@Repository
public interface ReleaseRepository extends JpaRepository<Release, Long> {

}
