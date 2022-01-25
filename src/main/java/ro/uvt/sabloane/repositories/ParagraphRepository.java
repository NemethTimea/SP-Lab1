package ro.uvt.sabloane.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.sabloane.models.Paragraph;

@Repository
public interface ParagraphRepository extends JpaRepository<Paragraph, Integer> {
}
