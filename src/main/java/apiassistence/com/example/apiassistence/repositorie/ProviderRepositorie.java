package apiassistence.com.example.apiassistence.repositorie;


import apiassistence.com.example.apiassistence.domain.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepositorie extends JpaRepository<Provider, Integer> {
}
