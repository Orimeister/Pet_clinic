package orimeister.demo.pet_clinic.entities;

import jakarta.persistence.*;
import orimeister.demo.pet_clinic.superclasses.BaseEntity;

import java.util.List;
@Entity
@Table(name="nurse")
public class Nurse extends BaseEntity {
    @Column(name="name")
    private String name;
    @OneToMany(mappedBy = "nurse",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<NurseAppointment> appointments;

    public Nurse() {
    }

    public Nurse(String name, List<NurseAppointment> appointments) {
        this.name = name;
        this.appointments = appointments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NurseAppointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<NurseAppointment> appointments) {
        this.appointments = appointments;
    }
}
