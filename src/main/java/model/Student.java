package model;

import base.entity.BaseEntity;
import enums.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;
import util.validation.ValidationCode;

import java.util.Date;
import java.util.List;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Entity
public class Student extends BaseEntity<Long> {
    @NotNull(message = "firstName most not null")
    String firstName;
    @NotNull(message = "lastName most not null")
    String lastName;
    @NotNull(message = "fatherName most not null")
    String fatherName;
    @NotNull(message = "motherName most not null")
    String motherName;
    String password;
    @NotNull(message = "nationalCode most not null")
    @ValidationCode(message = "please enter a valid national code")
    @Column(unique = true)
    String nationalCode;
    @NotNull(message = "phoneNumber most not null")
    @Pattern(regexp = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$")
    @Column(unique = true)
    String phoneNumber;
    @NotNull(message = "birthDate most not null")
    @Temporal(TemporalType.DATE)
    Date birthdate;
    @Column(unique = true)
    @NotNull(message = "studentCode most not null")
    @Size(min = 10, max = 10)
    @Pattern(regexp = "[0-9]+")
    String studentCode;
    @NotNull(message = "universityName most not null")
    String universityName;
    @NotNull(message = "universityTypes most not null")
    @Enumerated(EnumType.STRING)
    UniversityTypes universityTypes;
    @NotNull(message = "enterDate most not null")
    @Temporal(TemporalType.DATE)
    Date enterDate;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "grade most not null")
    Grades grade;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "style most not null")
    Style style;
    @NotNull(message = "city most not null")
    String city;
    @Column(columnDefinition = "TEXT")
    @NotNull(message = "address most not null")
    String address;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "maritalStatus most not null")
    MaritalStatus maritalStatus;
    @NotNull(message = "cardNumber most not null")
    @Size(min = 16, max = 16)
    @Pattern(regexp = "[0-9]+")
    String cardNumber;
    @NotNull(message = "cvv2 most not null")
    @Size(min = 3, max = 5)
    @Pattern(regexp = "[0-9]+")
    String cvv2;
    @NotNull(message = "expireCardDate most not null")
    @Temporal(TemporalType.DATE)
    Date expireCardDate;
    @Enumerated(EnumType.STRING)
    DayOrNight dayOrNight;
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    WifeOrHusband wifeOrHusband;
    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    List<EducationLoan> educationLoans;
    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    List<TuitionLoan> tuitionLoans;
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    Mortgage mortgage;
}
