package apiassistence.com.example.apiassistence.service;


import apiassistence.com.example.apiassistence.domain.Called;
import apiassistence.com.example.apiassistence.repositorie.CalledRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalledService {

    @Autowired
    private CalledRepositorie repo;

    public List<Called> findAll(){
        return repo.findAll();
    }
}
