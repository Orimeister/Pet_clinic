package orimeister.demo.pet_clinic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orimeister.demo.pet_clinic.entities.Doctor;
import orimeister.demo.pet_clinic.repositories.DoctorRepository;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;
    public List<Doctor> findByName(String name){
        return doctorRepository.findByName(name);
    }
    public List<Doctor> findByEmail(String email){
        return doctorRepository.findByEmail(email);

    }
    public List<Doctor> findByPhoneNumber(String phoneNumber){
        return doctorRepository.findByPhoneNumber(phoneNumber);
    }
    public List<Doctor> findByNameContaining(String name){
        return doctorRepository.findByNameContaining(name);
    }
    public List<Doctor> findByEmailContaining(String email){
        return doctorRepository.findByEmailContaining(email);
    }
}
