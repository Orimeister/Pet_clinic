package orimeister.demo.pet_clinic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orimeister.demo.pet_clinic.entities.Nurse;
import orimeister.demo.pet_clinic.repositories.NurseRepository;

import java.util.List;

@Service
public class NurseService {
    @Autowired
    private NurseRepository nurseRepository;
    public List<Nurse> findByName(String name){
        return nurseRepository.findByName(name);

    }


}
