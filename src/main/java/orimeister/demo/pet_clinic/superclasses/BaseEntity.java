package orimeister.demo.pet_clinic.superclasses;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime instant;
    @LastModifiedDate
    private LocalDateTime lastModifierDate;

    public LocalDateTime getInstant() {
        return instant;
    }

    public void setInstant(LocalDateTime instant) {
        this.instant = instant;
    }

    public LocalDateTime getLastModifierDate() {
        return lastModifierDate;
    }

    public void setLastModifierDate(LocalDateTime lastModifierDate) {
        this.lastModifierDate = lastModifierDate;
    }
}
