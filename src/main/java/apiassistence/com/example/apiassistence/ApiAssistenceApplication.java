package apiassistence.com.example.apiassistence;

import apiassistence.com.example.apiassistence.domain.AddressProvider;
import apiassistence.com.example.apiassistence.domain.Called;
import apiassistence.com.example.apiassistence.domain.Provider;
import apiassistence.com.example.apiassistence.domain.enums.StatusProvider;
import apiassistence.com.example.apiassistence.domain.enums.TypeProvider;
import apiassistence.com.example.apiassistence.repositorie.AddressRepositorie;
import apiassistence.com.example.apiassistence.repositorie.CalledRepositorie;
import apiassistence.com.example.apiassistence.repositorie.ProviderRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ApiAssistenceApplication implements CommandLineRunner {


	@Autowired
	private ProviderRepositorie providerRepositorie;

	@Autowired
	private AddressRepositorie addressRepositorie;

	@Autowired
	private CalledRepositorie calledRepositorie;

	public static void main(String[] args)  {
		SpringApplication.run(ApiAssistenceApplication.class, args);
	}

	public void run(String... args) throws Exception{

		Provider pro1 = new Provider(null, "luiz borracheiro", "31987876556", StatusProvider.OFFLINE, TypeProvider.BORRACHEIRO, "luizborracheiro@gmail.com", false );
		Provider pro2 = new Provider(null, "Carlos Guincho", "31987876556", StatusProvider.ONLINE, TypeProvider.GUINCHO, "carlosguincho@gmail.com", false );


		AddressProvider end1 = new AddressProvider(null, "Av Barao", "3150", "Estacionamento", pro1, "minas gerais", "37177000");
		AddressProvider end2 = new AddressProvider(null, "Av Professor mario werneck", "730", "Apartamento", pro1, "minas gerais", "37177000");
		AddressProvider end3 = new AddressProvider(null, "Av Professor mario werneck", "2230", "Loja", pro2, "minas gerais", "37178200");

		pro1.getAddresses().addAll(Arrays.asList(end1, end2));
		pro2.getAddresses().addAll(Arrays.asList(end3));

		Called call1 =  new Called(null, "Pneu furado", "Pneu estourou no buraco", "lat:-19.299, lng:-40.200", "Av Barao homen de melo", "lat:19.299, lng:-41.222",
				"Prof Mario Werneck ",29, 19, 29, 21, 23, 33, 50, pro1 );

		providerRepositorie.saveAll(Arrays.asList(pro1, pro2));
		addressRepositorie.saveAll(Arrays.asList(end1, end2, end3));

		calledRepositorie.saveAll(Arrays.asList(call1));
	}

}
