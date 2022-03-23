package apiassistence.com.example.apiassistence.domain;


import apiassistence.com.example.apiassistence.domain.enums.StatusCalled;
import apiassistence.com.example.apiassistence.domain.enums.StatusProvider;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Called implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String problem;
    private String description;
    private String addressOcorrencyLatLng;  // pegando latitude e longitude Noa sei se vai dar certo kk
    private String addressOcorrency;
    private String addressDestinyLatLng;  // pegando latitude e longitude Noa sei se vai dar certo kk
    private String addressDestiny;
    private float timeOcorrenncyXDestiny;
    private float distanceOcorrencyXDestiny;
    private float TimeProviderXOcorrency;
    private float distanceProviderXOcorrency;
    private float timeProviderXDestiny;
    private float distanceProviderXDestiny;
    private float timeOperation;
    private Integer status;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name="address_id")
    private AddressProvider addressProvider;

//    @ManyToOne
//    @JoinColumn(name = "")

    public Called(){
    }

    public Called(Integer id, String problem, String description, String addressOcorrencyLatLng, String addressOcorrency, String addressDestinyLatLng,
                  String addressDestiny, float timeOcorrenncyXDestiny, float distanceOcorrencyXDestiny, float timeProviderXOcorrency,
                  float distanceProviderXOcorrency, float timeProviderXDestiny, float distanceProviderXDestiny, float timeOperation,
                  StatusCalled status, Client client, AddressProvider addressProvider
    ) {
        this.id = id;
        this.problem = problem;
        this.description = description;
        this.addressOcorrencyLatLng = addressOcorrencyLatLng;
        this.addressOcorrency = addressOcorrency;
        this.addressDestinyLatLng = addressDestinyLatLng;
        this.addressDestiny = addressDestiny;
        this.timeOcorrenncyXDestiny = timeOcorrenncyXDestiny;
        this.distanceOcorrencyXDestiny = distanceOcorrencyXDestiny;
        TimeProviderXOcorrency = timeProviderXOcorrency;
        this.distanceProviderXOcorrency = distanceProviderXOcorrency;
        this.timeProviderXDestiny = timeProviderXDestiny;
        this.distanceProviderXDestiny = distanceProviderXDestiny;
        this.timeOperation = timeOperation;
        this.status = status.getCod();
        this.client = client;
        this.addressProvider = addressProvider;
    }

    public AddressProvider getAddressProvider() {
        return addressProvider;
    }

    public void setAddressProvider(AddressProvider addressProvider) {
        this.addressProvider = addressProvider;
    }


    public Client getClient() {return client;}
    public void setClient(Client client) {this.client = client;}

    public StatusCalled getStatus() throws IllegalAccessException {return StatusCalled.toEnum(status);}
    public void setStatus(StatusCalled status) {this.status = status.getCod();}

    public String getAddressOcorrencyLatLng() {return addressOcorrencyLatLng;}
    public void setAddressOcorrencyLatLng(String addressOcorrencyLatLng) {this.addressOcorrencyLatLng = addressOcorrencyLatLng;}

    public String getAddressDestinyLatLng() {return addressDestinyLatLng;}
    public void setAddressDestinyLatLng(String addressDestinyLatLng) {this.addressDestinyLatLng = addressDestinyLatLng;}

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getProblem() {return problem;}
    public void setProblem(String problem) {this.problem = problem;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public String getAddressOcorrency() {return addressOcorrency;}
    public void setAddressOcorrency(String addressOcorrency) {this.addressOcorrency = addressOcorrency;}

    public String getAddressDestiny() {return addressDestiny;}
    public void setAddressDestiny(String addressDestiny) {this.addressDestiny = addressDestiny;}

    public float getTimeOcorrenncyXDestiny() {return timeOcorrenncyXDestiny;}
    public void setTimeOcorrenncyXDestiny(float timeOcorrenncyXDestiny) {this.timeOcorrenncyXDestiny = timeOcorrenncyXDestiny;}

    public float getDistanceOcorrencyXDestiny() {return distanceOcorrencyXDestiny;}
    public void setDistanceOcorrencyXDestiny(float distanceOcorrencyXDestiny) {this.distanceOcorrencyXDestiny = distanceOcorrencyXDestiny;}

    public float getTimeProviderXOcorrency() {return TimeProviderXOcorrency;}
    public void setTimeProviderXOcorrency(float timeProviderXOcorrency) {TimeProviderXOcorrency = timeProviderXOcorrency;}

    public float getDistanceProviderXOcorrency() {return distanceProviderXOcorrency;}
    public void setDistanceProviderXOcorrency(float distanceProviderXOcorrency) {this.distanceProviderXOcorrency = distanceProviderXOcorrency;}

    public float getTimeProviderXDestiny() {return timeProviderXDestiny;}
    public void setTimeProviderXDestiny(float timeProviderXDestiny) {this.timeProviderXDestiny = timeProviderXDestiny;}

    public float getDistanceProviderXDestiny() {return distanceProviderXDestiny;}
    public void setDistanceProviderXDestiny(float distanceProviderXDestiny) {this.distanceProviderXDestiny = distanceProviderXDestiny;}

    public float getTimeOperation() {return timeOperation;}
    public void setTimeOperation(float timeOperation) {this.timeOperation = timeOperation;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Called called = (Called) o;
        return Objects.equals(id, called.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
