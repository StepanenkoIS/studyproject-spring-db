package is.studyprojectspringdb.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "ACCOUNT_BALANCE")
public class AccountBalance {

    @Id
    @Column(name = "ID_ACCOUNT")
    private Long idAccount;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "MONEY")
    private BigDecimal money;
}
