package apiassistence.com.example.apiassistence.repositorie;


import apiassistence.com.example.apiassistence.domain.AddressProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepositorie extends JpaRepository<AddressProvider, Integer> {
}
