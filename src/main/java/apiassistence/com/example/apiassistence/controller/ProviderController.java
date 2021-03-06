package apiassistence.com.example.apiassistence.controller;

import apiassistence.com.example.apiassistence.domain.Provider;
import apiassistence.com.example.apiassistence.request.NewProviderRequest;
import apiassistence.com.example.apiassistence.service.ProviderService;
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

@RequestMapping(value = "/provider")
@RestController
public class ProviderController {

    @Autowired
    private ProviderService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Provider>> findAll(){
        List<Provider> providers = service.findAll();

        return ResponseEntity.ok().body(providers);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> insert(@Valid @RequestBody NewProviderRequest objRequest) throws IllegalAccessException {
        Provider obj = service.fromRequest(objRequest);
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(obj.getId()).toUri();

        return  ResponseEntity.created(uri).build();
    }
}
