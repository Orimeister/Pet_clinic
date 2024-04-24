package orimeister.demo.pet_clinic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orimeister.demo.pet_clinic.entities.Diagnosis;
import orimeister.demo.pet_clinic.repositories.DiagnosisRepository;

import java.util.List;

@Service
public class DiagnosisService {
    @Autowired
    private DiagnosisRepository diagnosisRepository;
   public List<Diagnosis> findByAppointmentId(Integer appointmentId){
       return diagnosisRepository.findByAppointmentId(appointmentId);
   }
    public List<Diagnosis> findByDescriptionContainingIgnoreCase(String description){
       return diagnosisRepository.findByDescriptionContainingIgnoreCase(description);
    }
}
