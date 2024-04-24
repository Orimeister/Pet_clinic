package orimeister.demo.pet_clinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NurseAppointmentRepository extends JpaRepository<NurseAppointmentRepository, Integer> {
    List<NurseAppointmentRepository> findByNurseId(Integer nurseId);
    List<NurseAppointmentRepository> findByAppointmentId(Integer appointmentId);
}
