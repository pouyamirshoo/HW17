package model;

import base.entity.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class TuitionLoan extends BaseEntity<Long> {
    @NotNull
    int typeOfLoan;
    @NotNull(message = "timeOfTakeLoan most not null")
    @Temporal(TemporalType.DATE)
    Date timeOfTakeLoan;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    Student student;
    @OneToMany(mappedBy = "tuitionLoan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<UnpaidInstallments> unpaidInstallments;
    @OneToMany(mappedBy = "tuitionLoan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<PaidInstallments> paidInstallments;
}
