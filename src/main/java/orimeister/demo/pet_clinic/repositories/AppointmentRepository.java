package orimeister.demo.pet_clinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import orimeister.demo.pet_clinic.entities.Appointment;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer > {
    List<Appointment> findByPetId(Integer petId);
    List<Appointment> findByDoctorId(Integer doctorId);
    List<Appointment> findByDate(LocalDateTime date);
    List<Appointment> findByConsultationFee(BigDecimal consultationFee);
    List<Appointment> findByCancellationFeePaid(Boolean cancellationFeePaid);
    List<Appointment> findByAppointmentStatus(String appointmentStatus);

}
