package orimeister.demo.pet_clinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import orimeister.demo.pet_clinic.entities.Doctor;

import java.util.List;
import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    Optional<Doctor> findById(Integer Id);
    List<Doctor> findByName(String name);
    List<Doctor> findByEmail(String email);
    List<Doctor> findByPhoneNumber(Integer phoneNumber);
}
