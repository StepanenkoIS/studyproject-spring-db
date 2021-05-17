package is.studyprojectspringdb.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import javax.persistence.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "CLIENT")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENT")
    private Long id;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "BIRTHDAY")
    private String birthday;

    @Column(name = "PASSPORT_NUMBER")
    private String passportNumber;

    @Column(name = "ADDRESS_REGISTRATION")
    private String addressRegistration;

    @Column(name = "ADDRESS_RESIDENTIAL")
    private String addressResidential;

    @Column(name = "MOBILE_PHONE")
    private String mobilePhone;

    @Column(name = "EMAIL")
    private String email;

}


