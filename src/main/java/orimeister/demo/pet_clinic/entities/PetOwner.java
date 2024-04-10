package orimeister.demo.pet_clinic.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import orimeister.demo.pet_clinic.superclasses.Person;

@Entity
@Table(name="petowner")
public class PetOwner extends Person {
    @Column(name="secondPhoneNumber")
    @NotBlank
    private int secondaryPhoneNumber;
    @Column(name="address")
    @NotBlank
    private String address;


    public int getSecondaryPhoneNumber() {
        return secondaryPhoneNumber;
    }

    public void setSecondaryPhoneNumber(int secondaryPhoneNumber) {
        this.secondaryPhoneNumber = secondaryPhoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
