package apiassistence.com.example.apiassistence.controller;


import apiassistence.com.example.apiassistence.domain.Called;
import apiassistence.com.example.apiassistence.domain.Provider;
import apiassistence.com.example.apiassistence.service.CalledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
