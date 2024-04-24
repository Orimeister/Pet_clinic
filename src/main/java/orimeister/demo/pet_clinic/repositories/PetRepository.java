package orimeister.demo.pet_clinic.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import orimeister.demo.pet_clinic.entities.Pet;
import orimeister.demo.pet_clinic.entities.PetOwner;

import java.math.BigDecimal;
import java.util.List;
@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {
    List<Pet> findByPetOwner(PetOwner petOwner);
    List<Pet> findByBreed(String breed);
    List<Pet> findByAge(Integer age);
    List<Pet> findByWeight(BigDecimal weight);
    List<Pet> findByGender(String gender);
    List<Pet> findByColor(String color);
    List<Pet> findByName(String name);

    Page<Pet> findByBreed(String breed, Pageable pageable);



}
