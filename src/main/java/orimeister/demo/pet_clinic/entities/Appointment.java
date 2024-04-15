package orimeister.demo.pet_clinic.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import orimeister.demo.pet_clinic.superclasses.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
@Entity
@Table(name="appointments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Appointment extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="doctorID")
    private Doctor doctor;
    @OneToMany(mappedBy = "appointment")
    private List<Payment> payments;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="petID")
    private Pet pet;

    @OneToMany(mappedBy = "appointment", cascade = CascadeType.ALL)
    private List<Diagnosis> diagnoses;

    @Column(name = "consultation_fee", precision = 10, scale = 2)
    private BigDecimal consultationFee;

    @Column(name = "date")
    private LocalDateTime date;
    @Column(name = "cancellationFeePaid")
    private Boolean cancellationFeePaid;

    @Column(name = "appointment_status")
    private String appointmentStatus;

}
