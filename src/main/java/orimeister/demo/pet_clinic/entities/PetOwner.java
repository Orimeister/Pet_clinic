package orimeister.demo.pet_clinic.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import orimeister.demo.pet_clinic.superclasses.Person;

import java.util.List;

@Entity
@Table(name="petowner")
public class PetOwner extends Person {
    @Column(name="secondPhoneNumber")
    @NotBlank
    private String secondaryPhoneNumber;
    @Column(name="address")
    @NotBlank
    private String address;
    @OneToMany(fetch= FetchType.LAZY)
    @JoinColumn(name="owner_id")
    @OrderBy("name ASC")
    private List<Pet> pets;


    public PetOwner() {
    }

    public PetOwner(String secondaryPhoneNumber, String address, List<Pet> pets) {
        this.secondaryPhoneNumber = secondaryPhoneNumber;
        this.address = address;
        this.pets = pets;
    }

    public String getSecondaryPhoneNumber() {
        return secondaryPhoneNumber;
    }

    public void setSecondaryPhoneNumber(String secondaryPhoneNumber) {
        this.secondaryPhoneNumber = secondaryPhoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
