package apiassistence.com.example.apiassistence.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Client implements Serializable {

    // o certo aqui seria pegar algum campo de identificacao, e buscar no banco de dados
    // nao vai ser possível criar um chamado sem inserir um cliente junto

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id; // preencher com o id do cliente respectivo


    private String firstName;

    private String fullName;

    private String phone;

    private String email;

    private String statusPayments;

    private String status;

    private String plate;

    private String model;

    private String fuel;

    private String plan;

    @JsonBackReference
    @OneToMany(mappedBy = "client")
    private List<Called> calleds = new ArrayList<>();


    public Client (){
    }

    public Client(String id, String firstName, String fullName, String phone, String email, String statusPayments,
                  String status, String plate, String model, String fuel, String plan) {
        this.id = id;
        this.firstName = firstName;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.statusPayments = statusPayments;
        this.status = status;
        this.plate = plate;
        this.model = model;
        this.fuel = fuel;
        this.plan = plan;
    }

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getFullName() {return fullName;}
    public void setFullName(String fullName) {this.fullName = fullName;}

    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getStatusPayments() {return statusPayments;}
    public void setStatusPayments(String statusPayments) {this.statusPayments = statusPayments;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

    public String getPlate() {return plate;}
    public void setPlate(String plate) {this.plate = plate;}

    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}

    public String getFuel() {return fuel;}
    public void setFuel(String fuel) {this.fuel = fuel;}

    public String getPlan() {return plan;}
    public void setPlan(String plan) {this.plan = plan;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
