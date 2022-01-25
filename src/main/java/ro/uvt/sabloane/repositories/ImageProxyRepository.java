package ro.uvt.sabloane.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.sabloane.models.ImageProxy;

@Repository
public interface ImageProxyRepository extends JpaRepository<ImageProxy, Integer> {
}
