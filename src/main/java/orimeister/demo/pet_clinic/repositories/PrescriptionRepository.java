package orimeister.demo.pet_clinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import orimeister.demo.pet_clinic.entities.Prescription;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {
    List<Prescription> findByMedicationId(Integer medicationId);
    List<Prescription> findByDiagnosisId(Integer diagnosisId);
    List<Prescription> findByDate(LocalDate date);
    List<Prescription> findByDosage(String dosage);
}
