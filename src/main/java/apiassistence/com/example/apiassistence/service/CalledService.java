package apiassistence.com.example.apiassistence.service;


import apiassistence.com.example.apiassistence.domain.Called;
import apiassistence.com.example.apiassistence.domain.Client;
import apiassistence.com.example.apiassistence.domain.Provider;
import apiassistence.com.example.apiassistence.repositorie.CalledRepositorie;
import apiassistence.com.example.apiassistence.repositorie.ClientRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CalledService {

    @Autowired
    private CalledRepositorie repo;

    @Autowired
    private ClientRepositorie clientRepositorie;

    public List<Called> findAll(){
        return repo.findAll();
    }

    @Transactional
    public Called insert(Called obj) {
        obj.setId(null);
        obj = repo.save(obj);

        // está errado pois nao devo inserir cliente, devo relacionar os clientes com os costumers
        // clientRepositorie.saveAll(obj);

        return repo.save(obj);
    }


}
