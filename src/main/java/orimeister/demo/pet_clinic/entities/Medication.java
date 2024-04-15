package orimeister.demo.pet_clinic.entities;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import orimeister.demo.pet_clinic.superclasses.BaseEntity;

import java.math.BigDecimal;

@Entity
@Table(name="medications")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medication extends BaseEntity {
    @Column(name="name")
    private String name;

    @Column(name="cost")
    private BigDecimal cost;



}
