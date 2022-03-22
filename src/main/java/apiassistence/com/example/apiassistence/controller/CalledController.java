package apiassistence.com.example.apiassistence.controller;


import apiassistence.com.example.apiassistence.domain.Called;
import apiassistence.com.example.apiassistence.domain.Provider;
import apiassistence.com.example.apiassistence.request.NewCalledRequest;
import apiassistence.com.example.apiassistence.service.CalledService;
import org.h2.command.dml.Call;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RequestMapping(value = "/called")
@RestController
public class CalledController {


    @Autowired
    private CalledService service;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Called>> findAll(){
        List<Called> calleds = service.findAll();

        return ResponseEntity.ok().body(calleds);
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> insert (@Valid @RequestBody NewCalledRequest objRequest) throws IllegalAccessException {
        Called obj = service.fromRequest(objRequest);
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();

    }


}
