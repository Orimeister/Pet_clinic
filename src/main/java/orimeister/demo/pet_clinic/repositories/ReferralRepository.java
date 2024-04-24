package orimeister.demo.pet_clinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import orimeister.demo.pet_clinic.entities.Appointment;
import orimeister.demo.pet_clinic.entities.Referral;

import java.util.List;
@Repository
public interface ReferralRepository extends JpaRepository<Referral, Integer> {
    List<Referral> findByParentAppointment(Appointment appointment);
}
