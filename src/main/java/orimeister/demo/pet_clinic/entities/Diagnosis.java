package orimeister.demo.pet_clinic.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import orimeister.demo.pet_clinic.superclasses.BaseEntity;
@Entity
@Table(name="diagnoses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Diagnosis extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "appointmentID")
    private Appointment appointment;

    @Column(name="diagnosisDescription")
    private String description;



}
