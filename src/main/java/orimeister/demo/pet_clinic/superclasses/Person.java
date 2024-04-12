package orimeister.demo.pet_clinic.superclasses;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@MappedSuperclass
public  class Person extends BaseEntity {
    @Column(name="name")
    @NotBlank
    private String name;

    @Column(name="email", unique = true)
    @NotBlank
    private String email;

    @Column(name ="phoneNumber")
    @NotBlank
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
