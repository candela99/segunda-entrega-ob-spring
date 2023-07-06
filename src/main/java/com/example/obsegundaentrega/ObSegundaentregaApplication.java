package com.example.obsegundaentrega;

import com.example.obsegundaentrega.entities.Laptop;
import com.example.obsegundaentrega.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSegundaentregaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObSegundaentregaApplication.class, args);
		LaptopRepository laptopRepository = (LaptopRepository) context.getBean("laptopRepository");
		Laptop laptop1 = new Laptop(null,"Dell","Latitude 3410");
		Laptop laptop2 = new Laptop(null,"Acer","R3-3200u");
		laptopRepository.save(laptop1);
		laptopRepository.save(laptop2);
	}

}
