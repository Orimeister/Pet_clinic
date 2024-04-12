package orimeister.demo.pet_clinic.entities;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import orimeister.demo.pet_clinic.superclasses.BaseEntity;
@Entity
@Table(name="referrals")
public class Referral extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="appointmentID")
    private Appointment appointment;

    public Referral() {
    }

    public Referral(Appointment appointment) {
        this.appointment = appointment;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
}
