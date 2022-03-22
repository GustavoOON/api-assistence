package apiassistence.com.example.apiassistence.service;


import apiassistence.com.example.apiassistence.domain.Called;
import apiassistence.com.example.apiassistence.domain.Client;
import apiassistence.com.example.apiassistence.domain.enums.StatusCalled;
import apiassistence.com.example.apiassistence.domain.enums.StatusProvider;
import apiassistence.com.example.apiassistence.repositorie.CalledRepositorie;
import apiassistence.com.example.apiassistence.repositorie.ClientRepositorie;
import apiassistence.com.example.apiassistence.request.NewCalledRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CalledService {

    @Autowired
    private CalledRepositorie repo;

    public List<Called> findAll(){
        return repo.findAll();
    }

    @Transactional
    public Called insert (Called obj){
        obj.setId(null);
        obj = repo.save(obj);


        return obj;
    }


     public Called fromRequest(NewCalledRequest objRequest) throws IllegalAccessException {

        Client cli = new Client(objRequest.getIdCli(), objRequest.getFirstNameCli(), objRequest.getFullNameCli(), objRequest.getPhoneCli(), objRequest.getEmailCli(),
                objRequest.getStatusPaymentsCli(), objRequest.getStatusCli(), objRequest.getPlateCli(), objRequest.getModelCli(), objRequest.getFuelCli(), objRequest.getPlanCli());

        Called call = new Called(null, objRequest.getProblem(), objRequest.getDescription(), objRequest.getAddressOcorrencyLatLng(), objRequest.getAddressOcorrency(),
                objRequest.getAddressDestinyLatLng(), objRequest.getAddressDestiny(), objRequest.getTimeOcorrenncyXDestiny(), objRequest.getDistanceOcorrencyXDestiny(),
                objRequest.getTimeProviderXOcorrency(), objRequest.getDistanceProviderXOcorrency(), objRequest.getTimeProviderXDestiny(), objRequest.getDistanceProviderXDestiny(),
                objRequest.getTimeOperation(), StatusCalled.toEnum(objRequest.getStatus()), cli);

        // Nao sei se a relacao chamada prestador ta funcionando
        // noa sei a relacao chamada cliente ta funcionando


        return call;
    }

}
