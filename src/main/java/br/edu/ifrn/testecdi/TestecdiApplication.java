package br.edu.ifrn.testecdi;

import javax.enterprise.inject.spi.CDIProvider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestecdiApplication {

	public static void main(String[] args) {
            SpringApplication.run(TestecdiApplication.class, args);
	}
}
