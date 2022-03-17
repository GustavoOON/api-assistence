package apiassistence.com.example.apiassistence.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.tomcat.jni.Address;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class AddressProvider implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    private String place;

    @NotEmpty
    private String number;

    @NotEmpty
    private String complement;

    @NotEmpty
    private String district;

    @NotEmpty
    private String zipCode;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="provider_id")
    private Provider provider;

    public AddressProvider(){
    }

    public AddressProvider(Integer id, String place, String number, String complement, Provider provider, String district, String zipCode) {
        this.id = id;
        this.place = place;
        this.number = number;
        this.complement = complement;
        this.district = district;
        this.zipCode = zipCode;
        this.provider = provider;
    }

    public Provider getProvider() {
        return provider;
    }
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getPlace() {return place;}
    public void setPlace(String place) {this.place = place;}

    public String getNumber() {return number;}
    public void setNumber(String number) {this.number = number;}

    public String getComplement() {return complement;}
    public void setComplement(String complement) {this.complement = complement;}

    public String getDistrict() {return district;}
    public void setDistrict(String district) {this.district = district;}

    public String getZipCode() {return zipCode;}
    public void setZipCode(String zipCode) {this.zipCode = zipCode;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressProvider that = (AddressProvider) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
