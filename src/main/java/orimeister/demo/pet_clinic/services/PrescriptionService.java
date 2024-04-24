package orimeister.demo.pet_clinic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orimeister.demo.pet_clinic.entities.Prescription;
import orimeister.demo.pet_clinic.repositories.PrescriptionRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class PrescriptionService {
    @Autowired
    private PrescriptionRepository prescriptionRepository;
   public List<Prescription> findByMedicationId(Integer medicationId){
       return prescriptionRepository.findByMedicationId(medicationId);
   }
   public List<Prescription> findByDiagnosisId(Integer diagnosisId){
       return prescriptionRepository.findByDiagnosisId(diagnosisId);
   }
    public List<Prescription> findByDate(LocalDate date){
       return prescriptionRepository.findByDate(date);
    }
    public List<Prescription> findByDosage(String dosage){
       return prescriptionRepository.findByDosage(dosage);
    }


}
