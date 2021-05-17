package is.studyprojectspringdb.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ACCOUNT")
    private Long idAccount;

    @Column(name = "ID_CLIENT")
    private Long idClient;

    @Column(name = "TYPE_ACCOUNT")
    private String typeAccount;

    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;
}
