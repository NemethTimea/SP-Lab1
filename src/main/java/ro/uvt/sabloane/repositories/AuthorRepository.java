package ro.uvt.sabloane.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.sabloane.models.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}