package orimeister.demo.pet_clinic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orimeister.demo.pet_clinic.entities.Appointment;
import orimeister.demo.pet_clinic.entities.Referral;
import orimeister.demo.pet_clinic.repositories.ReferralRepository;

import java.util.List;

@Service
public class ReferralService {
    @Autowired
    private ReferralRepository referralRepository;

    public List<Referral> findByParentAppointment(Appointment appointment){
        return referralRepository.findByParentAppointment(appointment);
    }
}
