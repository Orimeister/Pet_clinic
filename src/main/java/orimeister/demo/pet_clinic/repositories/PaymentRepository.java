package orimeister.demo.pet_clinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import orimeister.demo.pet_clinic.entities.Payment;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    List<Payment> findByAppointmentId(Integer appointmentId);
    List<Payment> findByIsPaid(Boolean isPaid);
    List<Payment> findByPaymentType(String paymentType);
    List<Payment> findByAmountBetween(BigDecimal minAmount, BigDecimal maxAmount);
}
