package orimeister.demo.pet_clinic.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CollectionId;
import org.springframework.core.annotation.Order;
import orimeister.demo.pet_clinic.superclasses.BaseEntity;

import java.util.List;
@Entity
@Table(name="nurseappointments")
public class NurseAppointment extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name ="appointmentID")
    private Appointment appointment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="nurseID")
    private Nurse nurse;

    public NurseAppointment() {
    }

    public NurseAppointment(Appointment appointment, Nurse nurse) {
        this.appointment = appointment;
        this.nurse = nurse;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
}
