package orimeister.demo.pet_clinic.superclasses;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    @CreatedDate
    @Column(updatable = false)
    protected LocalDateTime instant;
    @LastModifiedDate
    protected LocalDateTime lastModifierDate;

    public java.time.LocalDateTime getInstant() {
        return instant;
    }

    public void setInstant(java.time.LocalDateTime instant) {
        this.instant = instant;
    }

    public java.time.LocalDateTime getLastModifierDate() {
        return lastModifierDate;
    }

    public void setLastModifierDate(java.time.LocalDateTime lastModifierDate) {
        this.lastModifierDate = lastModifierDate;
    }
}
