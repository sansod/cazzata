package it.linksmt.teamshare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.linksmt.teamshare.entities.Comment;
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
