package com.springbootex;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.javafaker.Faker;
import com.springbootex.model.Pie;
import com.springbootex.repositories.PieRepository;

@SpringBootApplication
public class SpringbootexApplication {

	private final Faker faker = new Faker();

    public static void main(String[] args) {
        SpringApplication.run(SpringbootexApplication.class, args);
    }

    @Bean
    public CommandLineRunner initializeDb(PieRepository repository){
        return (args) -> {
            repository.deleteAll();
            //Insert some random pies
            for(int i = 0; i < 20; i++) {
                repository.save(new Pie(faker.lorem().word(), faker.lorem().sentence()));
            }
        };
    }
}
