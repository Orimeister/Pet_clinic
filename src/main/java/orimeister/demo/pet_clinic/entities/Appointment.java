package orimeister.demo.pet_clinic.entities;

import jakarta.persistence.*;
import orimeister.demo.pet_clinic.superclasses.BaseEntity;

import java.util.List;

public class Appointment extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name="doctorID")
    @OrderBy("name ASC")
    private Doctor doctor;
    @OneToMany(mappedBy = "appointments",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Payment> payments;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="petID")
    private List<Pet> pets;



}
