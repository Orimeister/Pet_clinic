package orimeister.demo.pet_clinic.entities;

import jakarta.persistence.*;
import orimeister.demo.pet_clinic.superclasses.Person;

import java.util.List;

@Entity
@Table(name ="doctor")
public class Doctor extends Person {
@OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;
}
