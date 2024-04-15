package orimeister.demo.pet_clinic.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import orimeister.demo.pet_clinic.superclasses.BaseEntity;

import java.time.LocalDate;


@Entity
@Table(name="prescription")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Prescription extends BaseEntity {
    @Column(name="date")
    private LocalDate date;
    @Column(name="dosage")
    private String dosage;

    @ManyToOne
    @JoinColumn(name="medicationID")
    private Medication medication;

    @ManyToOne
    @JoinColumn(name="diagnosisID")
    private Diagnosis diagnosis;


}
