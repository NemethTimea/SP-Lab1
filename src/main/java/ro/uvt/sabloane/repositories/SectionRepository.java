package ro.uvt.sabloane.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.sabloane.models.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section,Integer> {
}
