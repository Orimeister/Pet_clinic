package orimeister.demo.pet_clinic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import orimeister.demo.pet_clinic.entities.Payment;
import orimeister.demo.pet_clinic.repositories.PaymentRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> findByAppointmentId(Integer appointmentId){
        return paymentRepository.findByAppointmentId(appointmentId);
    }
    public List<Payment> findByIsPaid(Boolean isPaid){
        return paymentRepository.findByIsPaid(isPaid);
    }
    public List<Payment> findByPaymentType(String paymentType){
        return paymentRepository.findByPaymentType(paymentType);
    }
    public List<Payment> findByAmountBetween(BigDecimal minAmount, BigDecimal maxAmount){
        return paymentRepository.findByAmountBetween(minAmount, maxAmount);
    }
}
