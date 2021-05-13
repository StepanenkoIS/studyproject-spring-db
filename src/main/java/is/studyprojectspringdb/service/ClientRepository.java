package is.studyprojectspringdb.service;

import is.studyprojectspringdb.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
