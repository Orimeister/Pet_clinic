package orimeister.demo.pet_clinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import orimeister.demo.pet_clinic.entities.Deferral;

import java.util.List;
@Repository
public interface DeferralRepository extends JpaRepository<Deferral, Integer> {
     List<Deferral> findByParentAppointment(Deferral deferral);

}
