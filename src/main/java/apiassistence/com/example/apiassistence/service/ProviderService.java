package apiassistence.com.example.apiassistence.service;


import apiassistence.com.example.apiassistence.domain.Provider;
import apiassistence.com.example.apiassistence.repositorie.ProviderRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderService {


    @Autowired
    private ProviderRepositorie repo;


    public List<Provider> findAll(){
        return repo.findAll();
    }


    public Provider insert (Provider obj){
        obj.setId(null);
        return repo.save(obj);
    }


}
