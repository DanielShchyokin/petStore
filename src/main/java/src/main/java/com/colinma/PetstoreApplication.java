package com.colinma;

import com.colinma.model.Pet;
import com.colinma.repositories.PetRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PetstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetstoreApplication.class, args);
	}

	/**
	 * Code adding data for demo purpose.
	 */
	@Bean
	public CommandLineRunner demo(PetRepository repository) {
		return (args) -> {
			// Save a couple of pets
			repository.save(new Pet("Bauer", true, Pet.PetType.dog, true, 1));
			repository.save(new Pet("O'Brian", false, Pet.PetType.cat, true, 2));
			repository.save(new Pet("Bauer", true, Pet.PetType.fish, false, 3));
			repository.save(new Pet("Palmer", false, Pet.PetType.dog, false, 4));
			repository.save(new Pet("Dessler", true, Pet.PetType.cat, true, 5));
			repository.save(new Pet("Roger", false, Pet.PetType.fish, true, 6));
		};
	}
}
