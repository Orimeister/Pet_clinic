package orimeister.demo.pet_clinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import orimeister.demo.pet_clinic.entities.Doctor;

import java.util.List;
import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    List<Doctor> findByName(String name);
    List<Doctor> findByEmail(String email);
    List<Doctor> findByPhoneNumber(String phoneNumber);
    List<Doctor> findByNameContaining(String name);
    List<Doctor> findByEmailContaining(String email);
}
