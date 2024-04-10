package orimeister.demo.pet_clinic.entities;

import jakarta.persistence.*;
import orimeister.demo.pet_clinic.superclasses.Person;

@Entity
@Table(name ="doctor")
public class Doctor extends Person {

}
