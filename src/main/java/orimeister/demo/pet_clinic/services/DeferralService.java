package orimeister.demo.pet_clinic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orimeister.demo.pet_clinic.entities.Deferral;
import orimeister.demo.pet_clinic.repositories.DeferralRepository;

import java.util.List;

@Service
public class DeferralService {
    @Autowired
    private DeferralRepository deferralRepository;

    public List<Deferral> findByParentAppointment(Deferral deferral){
        return deferralRepository.findByParentAppointment(deferral);
    }
}
