package orimeister.demo.pet_clinic.entities;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import org.springframework.core.annotation.Order;
import orimeister.demo.pet_clinic.superclasses.BaseEntity;

import java.math.BigDecimal;


@Entity
@Table(name = "payments")
public class Payment extends BaseEntity {
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "isPaid")
    private boolean isPaid;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="appointmentID")
    @OrderBy("date")
    private Appointment appointment;
    @Column(name = "paymentType")
    private String paymentType;

    public Payment(BigDecimal amount, boolean isPaid, Appointment appointment, String paymentType) {
        this.amount = amount;
        this.isPaid = isPaid;
        this.appointment = appointment;
        this.paymentType = paymentType;
    }

    public Payment() {

    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}