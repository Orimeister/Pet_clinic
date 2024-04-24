package orimeister.demo.pet_clinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import orimeister.demo.pet_clinic.entities.PetOwner;

import java.util.List;
import java.util.Optional;

    @Repository
    public interface PetOwnerRepository  extends JpaRepository<PetOwner, Integer> {
        Optional<PetOwner> findByName(String name);
        List<PetOwner> findByPhoneNumber(String phoneNumber);
        Optional<PetOwner> findByEmail(String email);
        List<PetOwner> findBySecondaryPhoneNumber(String secondaryPhoneNumber);
        List<PetOwner> findByAddressContaining(String address);
    }
