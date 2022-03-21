package apiassistence.com.example.apiassistence.service;

import apiassistence.com.example.apiassistence.domain.Client;
import apiassistence.com.example.apiassistence.repositorie.CalledRepositorie;
import apiassistence.com.example.apiassistence.repositorie.ClientRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientService {

    @Autowired
    private ClientRepositorie repo;

    public List<Client> findAll(){
        return repo.findAll();
    }
}
