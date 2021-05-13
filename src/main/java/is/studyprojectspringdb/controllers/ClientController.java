package is.studyprojectspringdb.controllers;


import is.studyprojectspringdb.entity.Client;
import is.studyprojectspringdb.service.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    private ClientRepository clientRepository;

    @Autowired
    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/client/all")
    public List<Client> allClient() {
        return clientRepository.findAll();
    }

}
