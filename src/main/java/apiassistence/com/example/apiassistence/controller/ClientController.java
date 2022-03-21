package apiassistence.com.example.apiassistence.controller;


import apiassistence.com.example.apiassistence.domain.Client;
import apiassistence.com.example.apiassistence.domain.Provider;
import apiassistence.com.example.apiassistence.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/client")
@RestController
public class ClientController {


    @Autowired
    private ClientService service;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Client>> findAll(){
        List<Client> clients = service.findAll();

        return ResponseEntity.ok().body(clients);
    }
}
