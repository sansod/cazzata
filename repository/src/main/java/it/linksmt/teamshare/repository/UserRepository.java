package it.linksmt.teamshare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.linksmt.teamshare.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail (String email );
	User findByFirstName (String firstName);
	User findByLastName (String lastName);
}
