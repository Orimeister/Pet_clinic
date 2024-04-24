package orimeister.demo.pet_clinic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orimeister.demo.pet_clinic.entities.PetOwner;
import orimeister.demo.pet_clinic.repositories.PetOwnerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PetOwnerService {
    @Autowired
    private PetOwnerRepository petOwnerRepository;
    public Optional<PetOwner> findPetOwnerByName(String name) {
        return petOwnerRepository.findByName(name);
    }
    public List<PetOwner> findPetOwnersByPhoneNumber(String phoneNumber) {
        return petOwnerRepository.findByPhoneNumber(phoneNumber);
    }

    public Optional<PetOwner> findPetOwnerByEmail(String email) {
        return petOwnerRepository.findByEmail(email);
    }

    public List<PetOwner> findPetOwnersBySecondaryPhoneNumber(String secondaryPhoneNumber) {
        return petOwnerRepository.findBySecondaryPhoneNumber(secondaryPhoneNumber);
    }

    public List<PetOwner> findPetOwnersByAddressContaining(String address) {
        return petOwnerRepository.findByAddressContaining(address);
    }

    // Additional methods to handle other CRUD operations
    public PetOwner savePetOwner(PetOwner petOwner) {
        return petOwnerRepository.save(petOwner);
    }

    public void deletePetOwner(Integer id) {
        petOwnerRepository.deleteById(id);
    }

    public List<PetOwner> findAllPetOwners() {
        return petOwnerRepository.findAll();
    }

}
