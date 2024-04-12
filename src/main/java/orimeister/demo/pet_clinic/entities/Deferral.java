package orimeister.demo.pet_clinic.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="deferrals")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Deferral {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="appointmentID")
    private Appointment appointment;
}
