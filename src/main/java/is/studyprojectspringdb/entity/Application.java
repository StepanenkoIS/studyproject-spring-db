package is.studyprojectspringdb.entity;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "APPLICATION")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_APP")
    private Long idApp;

    @Column(name = "ID_CLIENT")
    private Long idClient;

    @Column(name = "FROM_ACCOUNT")
    private Long fromAccount;

    @Column(name = "TO_ACCOUNT")
    private Long toAccount;

    @Column(name = "MONEY")
    private BigDecimal money;

    @Column(name = "CREATION_DATE")
    private LocalDate creationDate;

    @Column(name = "ID_REGULAR")
    private Long idRegular;
}

