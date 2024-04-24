package orimeister.demo.pet_clinic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orimeister.demo.pet_clinic.repositories.NurseAppointmentRepository;
import orimeister.demo.pet_clinic.repositories.NurseRepository;

import java.util.List;

@Service
public class NurseAppointmentService {
    @Autowired
    private NurseAppointmentRepository nurseAppointmentRepository;
    public List<NurseAppointmentRepository> findByNurseId(Integer nurseId){
        return nurseAppointmentRepository.findByNurseId(nurseId);
    }
    public List<NurseAppointmentRepository> findByAppointmentId(Integer appointmentId){
        return nurseAppointmentRepository.findByAppointmentId(appointmentId);
    }
}
