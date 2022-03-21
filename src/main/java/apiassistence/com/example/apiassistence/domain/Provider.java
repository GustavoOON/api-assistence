package apiassistence.com.example.apiassistence.domain;

import apiassistence.com.example.apiassistence.domain.enums.StatusProvider;
import apiassistence.com.example.apiassistence.domain.enums.TypeProvider;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.apache.tomcat.jni.Address;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Provider implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    // tipo prestador
    private Integer type;

    private String telefone;

    private String email;

    private boolean disable;

    private Integer status;

    // MOSTRAR OS ENDERECOS no provider, e nao mostrar o provider no endereco
    // @JsonIgnore
    @JsonManagedReference
    @OneToMany(mappedBy = "provider")
    private List<AddressProvider> addresses = new ArrayList<>();


    @JsonBackReference
    @OneToMany(mappedBy = "provider")
    private List<Called> calleds = new ArrayList<>();

    public Provider(){
    }

   // public Provider(Integer id, String name, String telefone, StatusProvider status, TypeProvider type, String email, Called calleds, boolean disable) {
    public Provider(Integer id, String name, String telefone, StatusProvider status, TypeProvider type, String email, boolean disable) {
        this.id = id;
        this.name = name;
        this.telefone = telefone;
        this.email = email;
        this.disable = disable;
        this.type = type.getCod();
        this.status = status.getCod();
    }

    public TypeProvider getType() throws IllegalAccessException {return TypeProvider.toEnum(type);}
    public void setType(TypeProvider type) {this.type = type.getCod();}

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}

    public StatusProvider getStatus() throws IllegalAccessException {return StatusProvider.toEnum(status);}
    public void setStatus(StatusProvider status) {this.status = status.getCod();}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public boolean isDisable() {return disable;}
    public void setDisable(boolean disable) {this.disable = disable;}

    public List<AddressProvider> getAddresses() {
        return addresses;
    }
    public void setAddresses(List<AddressProvider> addresses) {
        this.addresses = addresses;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Provider provider = (Provider) o;
        return Objects.equals(id, provider.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
