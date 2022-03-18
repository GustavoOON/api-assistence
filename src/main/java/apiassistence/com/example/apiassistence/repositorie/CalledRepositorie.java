package apiassistence.com.example.apiassistence.repositorie;


import apiassistence.com.example.apiassistence.domain.Called;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalledRepositorie extends JpaRepository<Called, Integer> {
}
