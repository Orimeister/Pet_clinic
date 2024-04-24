package orimeister.demo.pet_clinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import orimeister.demo.pet_clinic.entities.Medication;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface MedicationRepository extends JpaRepository<Medication,Integer> {
    List<Medication> findByMedicationName(String name);
    List<Medication> findByMeditationCost(BigDecimal cost);
}
