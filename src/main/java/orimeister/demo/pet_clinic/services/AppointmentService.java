package orimeister.demo.pet_clinic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orimeister.demo.pet_clinic.entities.Appointment;
import orimeister.demo.pet_clinic.repositories.AppointmentRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;
    public List<Appointment> findByPetId(Integer petId){
        return appointmentRepository.findByPetId(petId);
    }
    public List<Appointment> findByDoctorId(Integer doctorId){
        return appointmentRepository.findByDoctorId(doctorId);
    }
    public List<Appointment> findByDate(LocalDateTime date){
        return appointmentRepository.findByDate(date);
    }
    public List<Appointment> findByConsultationFee(BigDecimal consultationFee){
        return appointmentRepository.findByConsultationFee(consultationFee);
    }
    public List<Appointment> findByCancellationFeePaid(Boolean cancellationFeePaid){
        return appointmentRepository.findByCancellationFeePaid(cancellationFeePaid);
    }
    public List<Appointment> findByAppointmentStatus(String appointmentStatus){
        return appointmentRepository.findByAppointmentStatus(appointmentStatus);
    }
    public void deleteAppointment(Integer appointmentId){
        appointmentRepository.deleteById(appointmentId);
    }
    public void addAppointment(Appointment appointment){
        appointmentRepository.save(appointment);
    }
    public void updateAppointment(Appointment appointment){
        appointmentRepository.save(appointment);
    }

}
