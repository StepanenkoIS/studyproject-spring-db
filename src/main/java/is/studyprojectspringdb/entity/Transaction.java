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
@Table(name = "TRANSACTION")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TRANSACTION")
    private Long idApp;

    @Column(name = "FROM_ACCOUNT")
    private Long idClient;

    @Column(name = "TO_ACCOUNT")
    private Long fromAccount;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "DATE_EXECUTION")
    private LocalDate dateExecution;

}
