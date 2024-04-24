package orimeister.demo.pet_clinic.services;

import org.hibernate.annotations.NaturalId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import orimeister.demo.pet_clinic.entities.Pet;
import orimeister.demo.pet_clinic.entities.PetOwner;
import orimeister.demo.pet_clinic.repositories.PetRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PetService {
    @Autowired
    private PetRepository petRepository;

   public List<Pet> findByPetOwner(PetOwner petOwner){
       return petRepository.findByPetOwner(petOwner);
   }
    public List<Pet> findByBreed(String breed){
       return petRepository.findByBreed(breed);
    }
    public List<Pet> findByAge(Integer age){
       return petRepository.findByAge(age);
    }
    public List<Pet> findByWeight(BigDecimal weight){
       return petRepository.findByWeight(weight);

    }
    public List<Pet> findByGender(String gender){
       return petRepository.findByGender(gender);
    }
    public List<Pet> findByColor(String color){
       return petRepository.findByColor(color);
    }
    public List<Pet> findByName(String name){
       return petRepository.findByName(name);
    }

    public Page<Pet> findByBreed(String breed, Pageable pageable){
       return petRepository.findByBreed(breed, pageable);
    }
}
