package ro.uvt.sabloane.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.sabloane.models.Table;

@Repository
public interface TableRepository extends JpaRepository<Table, Integer> {
}
