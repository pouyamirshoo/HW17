package model;

import base.entity.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Entity
public class PaidInstallments extends BaseEntity<Long> {
    @NotNull
    @Temporal(TemporalType.DATE)
    Date date;
    @NotNull
    Long amount;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    EducationLoan educationLoan;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    TuitionLoan tuitionLoan;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    Mortgage mortgage;
}
