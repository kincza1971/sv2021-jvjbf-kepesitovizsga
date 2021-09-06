package training360.guinessapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import training360.guinessapp.entity.WorldRecord;

@Repository
public interface WorldRecordRepository extends JpaRepository<WorldRecord, Long> {
}
