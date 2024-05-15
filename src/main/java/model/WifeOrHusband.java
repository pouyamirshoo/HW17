package model;

import base.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;
import util.validation.ValidationCode;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Entity
public class WifeOrHusband extends BaseEntity<Long> {
    @NotNull(message = "firstName most not null")
    String firstName;
    @NotNull(message = "lastName most not null")
    String lastName;
    @NotNull(message = "nationalCode most not null")
    @ValidationCode(message = "please enter a valid national code")
    @Column(unique = true)
    String nationalCode;
    @OneToOne
    @JoinColumn(referencedColumnName = "id")
    Student student;
}
