package ro.uvt.sabloane.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.sabloane.models.TableOfContents;

@Repository
public interface TOCRepository extends JpaRepository<TableOfContents, Integer> {
}
