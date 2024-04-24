package orimeister.demo.pet_clinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import orimeister.demo.pet_clinic.entities.Nurse;

import java.util.List;

@Repository
public interface NurseRepository extends JpaRepository<Nurse, Integer> {
    List<Nurse> findByName(String name);

}
