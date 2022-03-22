package apiassistence.com.example.apiassistence.service;


import apiassistence.com.example.apiassistence.domain.AddressProvider;
import apiassistence.com.example.apiassistence.domain.Provider;
import apiassistence.com.example.apiassistence.domain.enums.StatusProvider;
import apiassistence.com.example.apiassistence.domain.enums.TypeProvider;
import apiassistence.com.example.apiassistence.repositorie.AddressRepositorie;
import apiassistence.com.example.apiassistence.repositorie.ProviderRepositorie;
import apiassistence.com.example.apiassistence.request.NewProviderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProviderService {


    @Autowired
    private ProviderRepositorie repo;

    @Autowired
    private AddressRepositorie addressRepositorie;

    public List<Provider> findAll(){
        return repo.findAll();
    }

    @Transactional
    public Provider insert (Provider obj){
        obj.setId(null);

        obj = repo.save(obj);
        addressRepositorie.saveAll(obj.getAddresses()); // lista de enderecos do provider
        return obj;
    }

    public Provider fromRequest(NewProviderRequest objRequest) throws IllegalAccessException {
        Provider prov = new Provider(null, objRequest.getName(), objRequest.getTelefone(), StatusProvider.toEnum(objRequest.getStatus()),
                TypeProvider.toEnum(objRequest.getType()), objRequest.getEmail(), objRequest.isDisable());

        AddressProvider addr = new AddressProvider(null, objRequest.getPlace(), objRequest.getNumber(), objRequest.getComplement(), prov, objRequest.getDistrict(), objRequest.getZipCode());

        prov.getAddresses().add(addr); // lista de enderecos do provedor, nao sei como passar mais de um endereco

        return prov;
    }

}
