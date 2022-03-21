package apiassistence.com.example.apiassistence.repositorie;


import apiassistence.com.example.apiassistence.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepositorie extends JpaRepository<Client, Integer> {
}
