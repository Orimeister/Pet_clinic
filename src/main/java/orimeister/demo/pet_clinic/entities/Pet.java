package orimeister.demo.pet_clinic.entities;

import jakarta.persistence.*;
import orimeister.demo.pet_clinic.superclasses.BaseEntity;

import java.math.BigDecimal;
import java.util.List;

public class Pet extends BaseEntity {
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="ownerID")
    private PetOwner owner;
    @OneToMany(mappedBy = "pet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Appointment> appointments;

    @Column(name="petName")
    private String name;
    @Column(name="breed")
    private String breed;
    @Column(name="age")
    private Integer age;
    @Column(name="weight")
    private BigDecimal weight;
    @Column(name="gender")
    private String gender;
    @Column(name="color")
    private String color;

    public Pet() {
    }

    public Pet(PetOwner owner, List<Appointment> appointments, String name, String breed, Integer age, BigDecimal weight, String gender, String color) {
        this.owner = owner;
        this.appointments = appointments;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.color = color;
    }

    public PetOwner getOwner() {
        return owner;
    }

    public void setOwner(PetOwner owner) {
        this.owner = owner;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
