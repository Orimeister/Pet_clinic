package orimeister.demo.pet_clinic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orimeister.demo.pet_clinic.entities.Medication;
import orimeister.demo.pet_clinic.repositories.MedicationRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
public class MedicationService {
    @Autowired
    private MedicationRepository medicationRepository;
    public List<Medication> findByMedicationName(String name){
        return medicationRepository.findByMedicationName(name);
    }
    public List<Medication> findByMeditationCost(BigDecimal cost){
        return medicationRepository.findByMeditationCost(cost);
    }
}
